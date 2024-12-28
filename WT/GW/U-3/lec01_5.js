// FUNCTION

function Fx1() {
    console.log("Fx Without Parameters")
}

function Fx2(Name) {
    console.log("Fx Without Parameters")
    console.log("Name is",Name)
}

function Fx3(a,b){
    return a+b
}

// Anonymous Functions
let AnonymousFx = function(){console.log("WC")}

// Arrow Function
let add=(a,b) => a+b


Fx1()
Fx2("SJ")
console.log(Fx3(4,5))
console.log(AnonymousFx)
AnonymousFx()
console.log(add(2,6))