# CE4101-AvastCE 🛡

Simple example of an application of the strategy design pattern, we implement an "antivirus" 🛡

## Strategy Design Pattern 

### Problem 📛

One of the dominant strategies of object-oriented design is the "open-closed principle".

Figure demonstrates how this is routinely achieved - encapsulate interface details in a base class, and bury implementation details in derived classes. Clients can then couple themselves to an interface, and not have to experience the upheaval associated with change: no impact when the number of derived classes changes, and no impact when the implementation of a derived class changes.
<p align="center">
<img src="https://sourcemaking.com/files/v2/content/patterns/Strategy1.png?id=61b26a5a2f69fe4a7416"
     alt="problem"/>
 </p>

### Structure 🧩 

The **Interface** entity could represent either an **abstract base class**, or the method signature expectations by the client. In the former case, the **inheritance hierarchy represents dynamic polymorphism**. In the latter case, the Interface entity represents template code in the client and the inheritance hierarchy represents static polymorphism.

<p align="center">
<img src="https://sourcemaking.com/files/v2/content/patterns/Strategy_.png?id=786363dbbdb04e551aa8"
     alt="strategy"/>
 </p>

## Example

### AvastCE 🛡

For the example of this tutorial we will make a mock of an antivirus. **AvastCE antivirus** has many types of scans: quick scan, deep scan, file scan and others.
Not all scans can be run in the free version, for deep scans you must have a pro account.
We will use the Strategy pattern to implement the different types of scans that can be run.

<p align="center">
<img src="https://github.com/ce-box/CE4101-AvastCE/blob/master/docs/CE4101-T6-Diagrama%20AvastCE%20.png"
     alt="example"
     width="620"/>
</p>

---

