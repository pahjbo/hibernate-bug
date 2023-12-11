# hibernate-bug

This project is an attempt to recreate (in the smallest form) the quarkus-hibernate bug 
that not all fields are being updated when JOINED inheritance is used - see https://github.com/orppst/pst-api-service/issues/3

However, this small example with apparently the same structure works!

The problem seems (from looking in the debugger on the case that does not work) to be with when the $$_hibernate_tracker variable gets initialized and used.



