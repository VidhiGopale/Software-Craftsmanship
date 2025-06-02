Problem Statement: 
Simple Vending Machine System

A traditional vending machine needs an upgrade to a digital system. The current mechanical 
design is prone to errors (e.g., dispensing the wrong item, not returning change correctly) 
and offers no way for operators to easily track sales or manage inventory. 
A new, simpler digital system is needed to reliably dispense products, handle payments, 
manage product stock, and report basic sales information.

# Simple Vending Machine System

## Analysis-

1. Create Vending Machine
2. Vending Machine should Dispense the correct item
3. Vending Machine should Handle user payments and return correct change
4. Vending Machine should Track sales information
5. Operators should Manage inventory 
6. Operators should be able to track sales 
7. Vending Machine should Generate basic sales and stock reports


## Class

1. VendingMachine-
   1. Attributes- items: List<Item> , salesData: Map<Item,quantity>
   2. Behaviours- addItem, removeItem, returnChange, acceptMoney, dispenseItem, processTransaction

2. Item-
    1. Attributes- name, price, quantity, category(enum)
    2. Behaviours- get/set

3. User-
    1. Attributes- id, name, email
    2. Behaviours- insertMoney, selectItem, collectItem

4. Transaction-
   1. Attributes- id, itemName, amountPaid, changeGiven, time
   2. Behaviours- get/set

5. Operator-
   1. Attributes- id, name, item: List<Item>
   2. Behaviours- generateReport, addItem, removeItem

## Enum

1. Category- Snack, Drink, Candy