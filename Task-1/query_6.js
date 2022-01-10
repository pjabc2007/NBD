printjson(db.people.insertOne(
    {
        "sex":"Male",
        "first_name":"Przemyslaw",
        "last_name":"Maciejewski",
        "job":"Software Developer",
        "email":"s16682@pjwstk.edu.pl",
        "location":{
            "city":"Warszawa",
            "address":{
                "streetname":"Ulicowa",
                "streetnumber":"166"}
            },
        "description":"Ma nadzieje, ze zda NBD",
        "height":"165.5",
        "weight":"68.5",
        "birth_date":"1998-10-11T00:00:00Z",
        "nationality":"Poland",
        "credit":[
            {
                "type":"mastercard",
                "number":"201769457561818",
                "currency":"PLN",
                "balance":"123456.82"
            }
        ]
    }
))