#!/bin/bash
for i in `seq 1 10`;
    do
        curl -X GET https://anambiar-customer-app.cfapps.io/hello
    done    
