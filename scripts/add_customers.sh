#!/bin/bash

curl -d '{"name" : "Nikola Tesla"}' -H "Content-Type: application/json" -X POST {your-app-name}-customer-app-db.cfapps.io/customers
curl -d '{"name" : "Edison"}' -H "Content-Type: application/json" -X POST {your-app-name}-customer-app-db.cfapps.io/customers
curl -d '{"name" : "Alexander Graham Bell"}' -H "Content-Type: application/json" -X POST {your-app-name}-customer-app-db.cfapps.io/customers
curl -d '{"name" : "Charles Babbage"}' -H "Content-Type: application/json" -X POST {your-app-name}-customer-app-db.cfapps.io/customers
curl -d '{"name" : "Alan Turing"}' -H "Content-Type: application/json" -X POST {your-app-name}-customer-app-db.cfapps.io/customers