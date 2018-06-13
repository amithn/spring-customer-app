#!/bin/bash

curl -d '{"name" : "Nikola Tesla"}' -H "Content-Type: application/json" -X POST anambiar-cool-app-db.cfapps.io/customers | jq
curl -d '{"name" : "Edison"}' -H "Content-Type: application/json" -X POST anambiar-cool-app-db.cfapps.io/customers | jq
curl -d '{"name" : "Alexander Graham Bell"}' -H "Content-Type: application/json" -X POST anambiar-cool-app-db.cfapps.io/customers | jq
curl -d '{"name" : "Charles Babbage"}' -H "Content-Type: application/json" -X POST anambiar-cool-app-db.cfapps.io/customers | jq
curl -d '{"name" : "Alan Turing"}' -H "Content-Type: application/json" -X POST anambiar-cool-app-db.cfapps.io/customers | jq