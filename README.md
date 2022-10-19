# Bob's Bagels

![](../../_images/bagels.jpg)

### Bob needs you!

He wants you to implement a simple basket feature for him.

### From User Stories to a Domain Model

In this challenge, you will transform User Stories into a Domain Model and test-drive developing a program that satisfies the stories.

A **User Story** describes one thing a program is expected to do, from the perspective of somebody using that program. When planning a program, the client's requirements will be decomposed into many User Stories. Much of a developer's life is spent translating User Stories into a functional system. In Object-Oriented Programming, these systems are made up of **Objects** and **Messages**. Objects describe the objects within the system, and Messages describe how those objects interact. We call these systems **Domain Models**.


## User Stories

```
# Part 1
As a member of the public
So I can order a bagel when I want to
I'd like to add an item to my basket
```
Domain Model:
|Object|Properties   |Message  |Context|Output       |
|------|-------------|---------|-------|-------------|
|Basket|Bagels @Array|add(item)|       |@Array[@Item]|

ests:
Test 1 - Has an item been added to the basket?
Test 2 - Has THE item been added to the basket? 

```
As a member of the public,
So that I can change my order
I'd like to remove an item from my basket
```
Domain Model:
|Object|Properties   |Message      |Context|Output        |
|------|-------------|-------------|-------|--------------|
|Basket|Bagels @Array|add(bagel)   |       |@Array[@Bagel]|
|      |             |remove(bagel)|       |@Array[@Bagel]|

Tests:
Test 3 - Has an item been removed from the basket?
Test 4 - Has THE item been removed from the basket?

---
```
# Part 2
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
Tests:
Test 5 - Does the basket have a capacity?
Test 6 - Can an item be added, when the basket is at capacity? Check that the array length does not increase.

```
As a Bob's Bagels manager,
So that I can record more sales
I’d like to create baskets with larger capacity when I need to.
```
Tests:
Test 7 - Can the basket capacity be changed?

```
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket. In the same way, I want to know if I try to add an item with the same ID already in my basket.
```
Tests:
Test 8 - Is the user informed if they try to remove an item that isn't in the basket?
Test 9 - Is the user informed if they try to add an item that is already in the basket? 

---
```
# Part 3
As a member of the public,
So that I can know how much my bagels are,
I’d like to see the price of each item before I add it to my basket.
```
Tests: 
Test 10 - Can the price of each bagel be accessed?
Test 11 - Is the price of the bagel returned when it is added to the basket?

```
As a member of the public,
So that I can prepare to pay
When I go to checkout I'd like to know the total sum of the bagels in my basket
```
Tests:
Test 12 - Can the total price of the bagels be returned? 
