let obj={
    key1:"value - 1",
    key2:"value - 2",
    key3:"value - 3"
}

console.log(obj)
console.log(obj.key2)
console.log(obj['key3'])
obj.key4=false
console.log(obj)
delete obj.key4
console.log(obj)


let Fx={
    name:"SJ",
    greet:function(){
        console.log("Hello",this.name);
    }
}
Fx.greet()
console.log(Fx.greet())
console.log(Fx.greet[0])

function Person(name,age) {
    this.name=name
    this.age=age
}
let P1 = new Person("Shikher",20)
let P2 = new Person("Sonu",18)
console.log(P1.age)