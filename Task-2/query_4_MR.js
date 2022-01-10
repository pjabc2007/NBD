printjson(db.people.mapReduce(
    function()  
    { 
        emit( this.nationality, parseFloat(this.weight) / Math.pow(parseFloat(this.height) * 0.01, 2) ) 
    },
    function(key, values) { 
        const avg = arr => arr.reduce((p,c) => p + c, 0) / arr.length;
        return {
            avg_bmi: avg(Array.from(values)),
            min_bmi: Math.min(...values),
            max_bmi: Math.max(...values)
        }
    },
    { out: { inline: 1 } }
).results)