

/**
 * HelloWorldService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.web;

    /*
     *  HelloWorldService java interface
     */

    public interface HelloWorldService {
          

        /**
          * Auto generated method signature
          * 
                    * @param sayHello0
                
         */

         
                     public com.web.SayHelloResponse sayHello(

                        com.web.SayHello sayHello0)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param sayHello0
            
          */
        public void startsayHello(

            com.web.SayHello sayHello0,

            final com.web.HelloWorldServiceCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    