printjson(db.people.mapReduce(
    function()  { 
        this.credit.forEach(x => {
            emit(x.currency, parseFloat(x.balance))
        });
    },
    function(key, values) {
        const avg = arr => arr.reduce((p,c) => p + c, 0) / arr.length;
        return {
            balance: Array.sum(values),
            avg_balance: avg(Array.from(values))
        }
    },
    {
        query: { sex: "Female", nationality: "Poland" },
        out: { inline: 1 }
     }
).results)