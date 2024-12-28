console.log("STATEMENT")
/*
Sequencial:
Conditional:
Iteration
*/

var a= 987
// let a = parseInt(prompt("Enter :"))
console.log(a)
console.log(a)

var a4 = 65
if (a4>0) console.log(a4,"is greater then zero")
else if (a4==0) console.log(a4,"is zero")
else console.log(a4,"is smallest then zero")

// switch case 
key=4
switch (key) {
    case 1:
        console.log("cade 1")   
        break;
        default:
        console.log("default")   
        break;
}


// Iteration
let i=0
while (i<4){
    console.log(i+" ")
    i++
}

console.log("\n")

let j=0
do{
    console.log(j+" ")
    j++
}
while (j<4)

for (let i = 0; i < 5; i++) {
    process.stdout.write(i.toString()); // Use process.stdout.write for no newline
}

for (let i = 0; i < 5; i++) {
    console.log(i+" ")
}

let course ={name:"WT",code:"BCS-502"}
for(let property in course){
    console.log(property)      
    console.log(course[property])      
}

let arr=["dbms","wt","daa","coi","sc","cg"]
console.log(arr)
for(sub of arr){
    console.log(sub)      
}
