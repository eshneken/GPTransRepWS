package com.oracle.xmlns.gpsvcbusapp.gptransreposb.gptransreppipeline;

import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;

import java.util.List;

import java.util.Random;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import javax.jws.soap.SOAPBinding;

import javax.xml.bind.annotation.XmlSeeAlso;

import org.gp.orcl.xsd.trrequest.TransactionReportRequest;
import org.gp.orcl.xsd.trresponse.ObjectFactory;
import org.gp.orcl.xsd.trresponse.TransactionReportResponse;
import org.gp.orcl.xsd.trresponse.TransactionReportResponse.Transaction;



@WebService(name = "execute_ptt",
            targetNamespace = "http://xmlns.oracle.com/GPSvcBusApp/GPTransRepOSB/GPTransRepPipeline",
            serviceName = "execute_pttService", portName = "execute_bindPort",
            wsdlLocation = "/WEB-INF/wsdl/execute_pttService.wsdl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({ ObjectFactory.class, org.gp.orcl.xsd.trrequest.ObjectFactory.class })
public class ExecutePttImpl {
    public ExecutePttImpl() {
    }
    

    @WebResult(name = "transaction_report_response", partName = "response",
               targetNamespace = "http://www.gp.org/orcl/xsd/trresponse")
    @WebMethod(action = "getTransRep")
    public TransactionReportResponse getTransRep(@WebParam(name = "transaction_report_request", partName = "request",
                                                           targetNamespace = "http://www.gp.org/orcl/xsd/trrequest")
                                                 TransactionReportRequest request) {
        int min = 1, max = 50;
        TransactionReportResponse myTransactionReportResponse = new TransactionReportResponse();

        Date dEnd;
        Date dNow = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dt = new SimpleDateFormat("H:mm:ss:SSS");
        
        Random rand = new Random();
        int randomNum = rand.nextInt((max - min) + 1) + min;
        
        
        System.out.println(request.getMerchantPassword().toString() + "|" + System.getProperty("weblogic.Name") + "|GPTransRepWS->getReport|" + dt.format(dNow).toString() + "             |" + "|" + request.toString() + "|");


        myTransactionReportResponse.setMerchantName(request.getMerchantName().toString());
        myTransactionReportResponse.setRequestDateTime(request.getRequestDateTime().toString());
        myTransactionReportResponse.setFromDateTime(request.getFromDateTime());
        myTransactionReportResponse.setToDateTime(request.getToDateTime());
        myTransactionReportResponse.setResponseDateTime(ft.format(dNow).toString());


        /* RETURN 10 TRANSACTIONS */
        for (int i = 0; i <= randomNum; i++) {
            Transaction myTransaction = new Transaction();
            if ((i % 2) == 0) {
                myTransaction.setCardType("VISA");
                myTransaction.setHolderName("John Smith");
                myTransaction.setMerchantLocationCode("Alexandria");
                myTransaction.setCardNumber("4444-4444-4444-44" + String.format("%02d", i));
                myTransaction.setMerchantTransactionId(Integer.toString(i));
            } else {
                myTransaction.setCardType("MC");
                myTransaction.setHolderName("George Clooney");
                myTransaction.setMerchantLocationCode("Atlanta");
                myTransaction.setCardNumber("5555-5555-5555-55" + String.format("%02d", i));
                myTransaction.setMerchantTransactionId(Integer.toString(i));
            }
            myTransaction.setExpirationDate("01-05-2019");
            myTransaction.setRequestDateTime(ft.format(dNow).toString());
            myTransaction.setRequestDateTime(dt.format(dNow).toString());

            myTransactionReportResponse.getTransaction().add(myTransaction);

        }

        dEnd = new Date();
        System.out.println(request.getMerchantPassword().toString() + "|" + System.getProperty("weblogic.Name") + "|GPTransRepWS->getReport|" + "             |" + dt.format(dEnd).toString() + "|" + Integer.toString(randomNum).toString() + "|" + myTransactionReportResponse.toString() + "|");       

        // System.out.println(request.getMerchantName().toString() + "|" + System.getProperty("weblogic.Name") + "|GPTransRepWS->getReport|" + dt.format(dNow).toString() + "|" + dt.format(dEnd).toString() + "|" + Integer.toString(randomNum).toString() + "|");

        return myTransactionReportResponse;
    }
}
