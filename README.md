Open Data Warehouse
====================

In today's big data world, 'data warehouse' is a loaded term. Cool folks prefer other neologisms 
like 'data lake', 'streaming data' and the likes, labaling 'Data Warehouse' as some relic of the relational past.

Truth to be told, if you have a data system that continually churns data in any way and format, no matter 
if it's small or big data, you have the same concerns, which parallel an actual physical warehouse.
Here's a non-exhaustive list:

- keeping track of what's being delivered, incoming and outgoing
- schedule and monitor activities, keeping an audit trail of what's being done, in order to troubleshoot issues and improve processes
- ensure quality of data through cleaning and conforming
- coordinate activities between a wide variety of technologies

This project tries to offer a common framework for building a modern data warehouse/datalake/datapond,
however you may want to call it, trying not to be opinionated about it, meaning that we'll try to offer 
a general framework without imposing a particular technology.
For instance, we do need a general message bus, and your organization may force which one you can use (kafka,
aws sqs, rabbitmq, etc). We use akka/alpakka as a general abstraction framework in order for you to 
plugin whichever message queue you want to use. 

Beside message queue, there's key-value stores, document stores, relational databases, object stores, etc.
We don't want to tie you up with one in particular, but offer a logical abstraction to build your own strong, 
resilient data systems, in order to minimize time-to-market for your data, minimize time spent in operations,
and increase the quality and reliability of the data you deliver.

 