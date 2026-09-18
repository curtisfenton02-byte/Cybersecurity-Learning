# Trees Forests and Trusts

As companies continue to expand, as do their networks. As a result, having one domain becomes insufficient, and it becomes imperative that these enterprises add additional domains, to maintain efficiency.

## Trees

Active Directory supports the integration of multiple domains, which allows an organization to split the network into independently managed units.

As long as the network has multiple domains which all share the same **namespace** (Domain Name System hierarchy), for example thm.local and uk.thm.local, then they can be joined together into a **Tree**.

An example tree would have a root domain of **thm.local** and possibly two subdomains called uk.thm.local and us.thm.local.

Each root and subdomain would have its own Active Directory, computers and users.

### What is the function of a Network Tree?

The benefit to having a multi-structural network (tree) is that administrators receive better control over who can access what within the domain.

Take our thm.local example, the IT people from the UK will have their own Domain Controller responsible for solely managing the UK resources. Whereas, the US will have their own DC and resources. 

Neither of the users/administrators would be able to manage the devices or users within another domain. Therefore, giving full control of each Domain Controller to their respective Domain Administrators.

Policies could also be configured independently for each domain in the tree, allowing each domain to follow their countries' own laws and regulations. 

### Enterprise Admins

With the introduction of Trees and Forests within a domain network, there is also a new security group called **Enterprise Admins** which is required to oversee all the organization's domains. They are a user who has been granted administrative privileges which applies to all these domains.

However, each domain will still retain their respective Domain Admins with administrator privileges over that particular domain.

## Forests

This refers to the union of several trees, with different namespaces, into the same network.

For example, if thm.local merged with another company, called MHT inc, and they both retained their own trees. Then the new managers would configure a Forest structure.

## Trust Relationships

When a user from one domain (thm.local) needs to access a shared file located within one of the other domains (MHT or even uk.thm.local), they are relying on **Trust Relationships** to do so.

The basic idea behind a trust relationship, is that it allows trusted domains to authorize a user from another domain to access their resources.

### One-way Trust Relationship

This is one of the simplest forms of a trust relationship as it only requires one domain to trust and allow another domain to access their resources.

### Two-way Trust Relationships

Another type of trust relationship is the **two-way trust relationship**, which allows both domains to **mutually** authorize each other.

This is different to the previous trust relationship which only had one domain request **Trust**, whilst the other granted **Access**.

By default, joining several domains under a tree or forest structure will form a two-way relationship.

## Not Full Access

To be clear, just because two domains have a trust relationship, doesn't automatically grant them access to one another's resources. First users from other domains must be authorized and even then, it is the responsibility of those with privileged permissions to actually decide what resources are available to others.









