# metrics4-riemann-reporter-compile-error

This is a simple project to demonstrate `com.example.RiemannExtended` will not compile using `io.riemann:metrics4-riemann-reporter:0.5.2`.

Downgrading to `0.5.1` fixes the error:

Run:
```
./gradlew clean build 
```

To see the error:
```
> Task :compileJava FAILED

RiemannUDPMetricClient.java:8: error: cannot access IRiemannClient
        super(client);
             ^
  class file for IRiemannClient not found
1 error
```

`io.riemann.riemann.client.IRiemannClient` is included in source of `riemann-java-client`.

Attempted using a variety of JDKs, but all produce same result:

* OpenJDK Runtime Environment Corretto-8.322.06.1 (build 1.8.0_322-b06)
* OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
* Java(TM) SE Runtime Environment (build 17.0.1+12-LTS-39)
