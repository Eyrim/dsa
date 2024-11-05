Option A has way too high of a memory complexity to be useful. If we assume n and m to be 50, then n^m is 8.881784210^{84}. If we assume that n and m represent bytes then n^m is 8.88 gigabytes.
Options B and C are similar, but I think it makes more sense to use Option B, Option C is better scaling in terms of memory, whereas Option B is better scaling in terms of speed, though this doesn't inherently mean that Option B will run faster than C.

An important factor is what system this will run on, if it will be running on and old mainframe, then memory is more of a concern, particularly because mainframe languages are typically very fast on their own.

Supermarket:
---
Priority Queue: can order things by sell by date, prevents a lot of loss
    - Could introduce frustration to customer because they may have to dig for longer use-by items

Linked List:
    - Main operation is adding and removing which is very fast

Array:
    - Static, length should be the entire capacity of that item on the shelf
        - But would lead to wasting lots of space for low-stock items

Stack:
    - FIFO is easy to stack
    - No inherent ordering

I would choose a linked list, supermarkets sell stock quick enough that the benefits from the priority queue are limited if when a restock is done, they are added in order of sell-by if that is desired.

# dsa
