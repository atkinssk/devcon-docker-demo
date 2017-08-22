#!/bin/sh

HEALTH=`curl --connect-timeout 2 --max-time 2 --retry 0 --silent --show-error localhost:8080/healthcheck`
STATUS=$?
if [ $STATUS -eq  0 ]
then
    echo "Current healthcheck ${HEALTH}"
    test "${HEALTH}" = "HEALTHY"
    STATUS=$?
fi

if [ $STATUS -ne  0 ]
then
    STATUS=1
fi
exit $STATUS