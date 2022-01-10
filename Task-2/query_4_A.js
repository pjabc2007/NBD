printjson(db.people.aggregate(
    [
        {
            $project: 
            {
                nationality: true,
                bmi_index: 
                {
                    $divide: [
                        { $toDouble: "$weight" },
                        { $multiply: [
                            { $toDouble: "$height" }, 0.01,
                            { $toDouble: "$height" }, 0.01] 
                        }
                    ]
                }
            }
        },
        {
            $group: 
            {
                _id: "$nationality",
                avg_bmi: {$avg: "$bmi_index"},
                min_bmi: {$min: "$bmi_index"},
                max_bmi: {$max: "$bmi_index"}
            }
        }
    ]
).toArray())