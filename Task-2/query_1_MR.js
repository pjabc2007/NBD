printjson(db.people.mapReduce(
    function()  { emit( this.sex, { weight: parseFloat(this.weight), height: parseFloat(this.height) }) },
    function(key, values) { 
        const avg = arr => arr.reduce((p,c) => p + c, 0) / arr.length;
        return {
            avg_weight: avg(Array.from(values, v => v.weight)),
            avg_height: avg(Array.from(values, v => v.height))
        }},
    { out: { inline: 1 } }
).results)