# JPA Puzzler 4 - L1 Cache

It shows how L1 cache works. In fact, if services are in the same transaction they share the same set of entities. You can see it when selecting
pets in a separate JPQL update the entity selected before in a separate service.