printjson(db.people.aggregate(
    [
        {
            $group: 
            {
                _id: "$job"
            }
        },
        {
            $project:
            {
                _id: true
            }
        }
    ]
).toArray())