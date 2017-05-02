Examples of HBbase Rest and Thrift Secure Clients
==================================================


To run the rest client:

    java -cp target/hbase-clients-0.0.1-SNAPSHOT-all.jar \
        -Djava.security.krb5.conf=<krb5.conf>  -Djava.security.auth.login.config=<jaas.conf> \
        examples.hbase.rest.HttpClientSecureRestClient <rest-request>
        
E.g:

    java -cp target/hbase-clients-0.0.1-SNAPSHOT-all.jar \
        -Djava.security.krb5.conf=conf/krb5.cong  -Djava.security.auth.login.config=conf/jaas.conf \
        examples.hbase.rest.HttpClientSecureRestClient http://hadoop1-01-cdc.it.csiro.au:8101/