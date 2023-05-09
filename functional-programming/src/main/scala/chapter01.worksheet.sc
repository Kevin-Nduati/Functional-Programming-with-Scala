// Program with Side Effects
// We'll create a scala program that uses side effects in its implementation(also called an impure program)

// class Cafe{
//     def buyCoffee(cc: CreditCard): Coffee = {
//         val cup = new Coffee()
//         cc.charge(cup.price)
//         cup
//     }
// }


// The line cc.charge(cup.price) is an example of a side effect. This makes our code difficult to test
// Creditcard should not have any knowledge baked into it about how to contact the credit card company to actually execute a charge 
// We can make the code more modular and testable by letting creditcard ignorant of these concerns by passing a payments object into buyCoffee


// class cafe {
//     def buyCoffee(cc: CreditCard, p: Payments): Coffee = {
//         val cup = new Coffee()
//         p.charge(cc, cup.price)
//         cup
//     }
// }


// A Functional solution: removing the side effects
// The functional solution is to eliminate side effects and have buyCoffee return the charge as a value in addition to returning the Coffee. The concerns of processing the charge by sending it off to the credit card 
// by sending it off to the credit card company, persisting a record of it, and so on, will be handled elsewhere


// class Cafe {
//     def buyCoffee(cc: CreditCard): (Coffee, Charge) = {
//         val cup = new Coffee()
//         (cup, Charge(cc, cup.price))
//     }
// }

//  We've separated the concern of creating a charge from the processing or interpretation of that charge. The buyCoffee mow returns a Charge as a value along
// with the coffee 
