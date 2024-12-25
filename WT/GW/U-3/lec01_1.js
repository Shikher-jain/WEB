let n="n"
console.log(n)

var m="m"
console.log(m)

let o
console.log(o)

var p
console.log(p)

console.log("var is Fx-Scoped/Global-Scoped")
console.log("let is block-Scoped")

if (true){
    var x="var in the Fx"
    let y="Let in the Fx"
}
console.log(x)
// console.log(y)

var a=9
var a=9 //Use var or same variable witout any error

let b=2
// let b=2 //Raised Error: Identifier 'b' has already been declared

console.log(c) // undefined
var c=9
// console.log(d) //Cannot access 'd' before initialization
// let d=99

const Pi=22/7
// Pi=1 //Assignment to constant variable.
console.log(Pi)

console.log(typeof(n),typeof(m),typeof(o),typeof(p),typeof(x),typeof(a),typeof(b),typeof(c),typeof(Pi),typeof(null))
