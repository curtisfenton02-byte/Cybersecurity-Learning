# Applying ISM to A Scenario Company

## Outline

A fictional company called *Diverpool*, is based in the Liverpool area and operates a smartphone app which allows local businesses to provide cheap and local delivery to its customers located within the Liverpool City Region.

They do not employ delivery staff, instead the company operates a model similar to that of Deliveroo, where self-employed staff use the app to take on jobs and are paid per delivery. These individuals are known as **delivery agents**.

Unlike other delivery companies, Deliverpool's Unique Selling Proposition (a special benefit used by a company to make it stand out), is that they offer various and flexible types of delivery services compared to other organizations. 

Many of the customers of Deliverpool are businesses moving items to other businesses.

The Deliverpool app has three main components.

### Customer App

- The customer installs the app from an official app store.
- Customers can place delivery orders using said app.
- When a delivery is made, the delivery driver and customer place their devices together to complete the transaction via NFC (Near-Field Communication).
- The app can be used by both the customer and item recipient.
- Payment is made be the initiator of the order, not the recipient.
- Whilst it is not possible to make a delivery request without the app, it is possible to receive a delivery without it.
  
### Delivery App

- The delivery agents use a separate app to manage their work for Deliverpool.
- This app contains documented information such as the customer's orders, the physical handing off of the delivery to the customer.

### Control Panel

- Here, an oversight of the delivery agents' app usage and customer orders can be tracked and managed via a desktop application running in Deliverpool.
- The majority of staff within the company have access to this application, including the developers and administrators.

## Questions and Answers

## What are the main security problems this company will inevitably face, in relation to the CIA triad? 

I will break this answer down into three sections to best cover each point related to the CIA triad, specifically focusing on data security between the employees and customers.

### Confidentiality

This first section of the CIA triad ensures that information is only accessible to those that have been given explicit permission to access it. 

When applying considering the confidentiality of the data within this scenario, it is clear that there should be some concerns regarding potential unauthorized access or misuse of customer/order information.

For example, the control panel provides a majority of Deliverpool staff access to information relating to:

- Customers
- Orders
- Delivery agents
- Deliveries

Whilst these employees may have legitimate reasons to access the control panel, there is still the potential risks of someone accessing information they don't need for their job, or deliberately misusing said information.

Plus there is the potential confidentiality issue involving the delivery agents needing information about deliveries in order to complete their jobs. Despite this information being impervious to their role, it is also providing confidential information about the customer's address, name, purchase history and potentially more.

### Integrity 

Integrity refers to how **information should remain accurate, complete and unaltered without authorization**.

This is a particularly important concept for Deliverpool as its entire enterprise depends upon the order and delivery information being correct.

Some examples of information which must remain accurate are: 

- The delivery order
- Who is assigned the delivery
- Whether an item has been picked up
- Whether an item has been dropped off
- Completion of the transaction

A security problem would occur if someone were able to **alter or falsify this information**.

One example scenario could be that an attacker or malicious user could potentially alter an order or interfere with information documenting a pickup/delivery. This could result in the internal systems recording false or inaccurate information, potentially leading to customer confusion and/or hinder the delivery process.

However, this risk of data fabrication is also achievable by the internal employees at Deliverpool who could misuse their control panel access for personal gain or as a detriment to the company.

### Availability

This is used to ensure that systems and information remain accessible when authorized users require them.

When we consider availability in reference to Deliverpool, we can glean that customers not being capable of requesting delivery services without the app, poses a risk to the organization if the app ever becomes unavailable.

Likewise, the delivery app is necessary for delivery agents to manage their work and document pickup and drop-offs. Thus, if the application becomes unavailable, the delivery process could be disrupted.

Finally, the control panel is key to managing both delivery agents and orders. Therefore, its availability is also important for company productivity.

