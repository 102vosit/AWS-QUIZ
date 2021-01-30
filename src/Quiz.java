import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener{
	
	String[] questions =  {
								//** Edward **//
								/*1*/ "A solutions architect is designing a solution where users will be directed to a backup static error page if the primary website is unavailable. The primary website's DNS records are hosted in Amazon Route 53 where their domain is pointing to an Application Load Balancer (ALB). Which configuration should the solutions architect use to meet the company's needs while minimizing changes and infrastructure overhead?",
								/*2*/ "A solutions architect is designing a high performance computing (HPC) workload on Amazon EC2. The EC2 instances need to communicate to each other frequently and require network performance with low latency and high throughput. Which EC2 configuration meets these requirements", 
								/*3*/ "A company wants to host a scalable web application on AWS. The application will be accessed by users from different geographic regions of the world. Application users will be able to download and upload unique data up to gigabytes in size. The development team wants a cost-effective solution to minimize upload and download latency and maximize performance. What should a solutions architect do to accomplish this?",
								/*4*/ "A company is migrating from an on-premises infrastructure to the AWS Cloud. One of the company's applications stores files on a Windows file server farm that uses Distributed File System Replication (DFSR) to keep data in sync. A solutions architect needs to replace the file server farm. Which service should the solutions architect use?",
								/*5*/ "A company has a legacy application that process data in two parts. The second part of the process takes longer than the first, so the company has decided to rewrite the application as two microservices running on Amazon ECS that can scale independently. How should a solutions architect integrate the microservices?",
								/*6*/ "A company captures clickstream data from multiple websites and analyzes it using batch processing. The data is loaded nightly into Amazon Redshift and is consumed by business analysts. The company wants to move towards near-real-time data processing for timely insights. The solution should process the streaming data with minimal effort and operational overhead. Which combination of AWS services are MOST cost-effective for this solution?",
								/*7*/ "A company's application runs on Amazon EC2 instances behind an Application Load Balancer (ALB). The instances run in an Amazon EC2 Auto Scaling group across multiple Availability Zones. On the first day of every month at midnight, the application becomes much slower when the month-end financial calculation batch executes. This causes the CPU utilization of the EC2 instances to immediately peak to 100%, which disrupts the application. What should a solutions architect recommend to ensure the application is able to handle the workload and avoid downtime?",
								/*8*/ "A company runs a multi-tier web application that hosts news content. The application runs on Amazon EC2 instances behind an Application Load Balancer. The instances run in an EC2 Auto Scaling group across multiple Availability Zones and use an Amazon Aurora database. A solutions architect needs to make the application more resilient to periodic increases in request rates. Which architecture should the solutions architect implement?",
								/*9*/ "An application running on AWS uses an Amazon Aurora Multi-AZ deployment for its database. When evaluating performance metrics, a solutions architect discovered that the database reads are causing high I/O and adding latency to the write requests against the database. What should the solutions architect do to separate the read requests from the write requests?",
								/*10*/ "A recently acquired company is required to build its own infrastructure on AWS and migrate multiple applications to the cloud within a month. Each application has approximately 50 TB of data to be transferred. After the migration is complete, this company and its parent company will both require secure network connectivity with consistent throughput from their data centers to the applications. A solutions architect must ensure one-time data migration and ongoing network connectivity. Which solution will meet these requirements?",
								//**Muzaffar aka**//
								/*11*/ "A company serves content to its subscribers across the world using an application running on AWS. The application has several Amazon EC2 instances in a private subnet behind an Application Load Balancer (ALB). Due to a recent change in copyright restrictions, the chief information officer (CIO) wants to block access for certain countries. Which action will meet these requirements?",
								/*12*/ "A product team is creating a new application that will store a large amount of data. The data will be analyzed hourly and modied by multipleAmazon EC2 Linux instances. The application team believes the amount of space needed will continue to grow for the next 6 months.Which set of actions should a solutions architect take to support these needs?",
								/*13*/ "A company is migrating a three-tier applilobarcation to AWS. The application requires a MySQL database. In the past, the application users reportedpoor application performance when creating new entries. These performance issues were caused by users generating different real-time reportsfrom the application during working hours.Which solution will improve the performance of the application when it is moved to AWS?",
								/*14*/ "A solutions architect is deploying a distributed database on multiple Amazon EC2 instances. The database stores all data on multiple instancesso it can withstand the loss of an instance. The database requires block storage with latency and throughput to support several milliontransactions per second per server.Which storage solution should the solutions architect use?",
								/*15*/ "Organizers for a global event want to put daily reports online as static HTML pages. The pages are expected to generate millions of views fromusers around the world. The les are stored in an Amazon S3 bucket. A solutions architect has been asked to design an ecient and effectivesolution.Which action should the solutions architect take to accomplish this?",
								/*16*/ "A solutions architect is designing a new service behind Amazon API Gateway. The request patterns for the service will be unpredictable and canchange suddenly from 0 requests to over 500 per second. The total size of the data that needs to be persisted in a database is currently less than1 GB with unpredictable future growth. Data can be queried using simple key-value requests.Which combination of AWS services would meet these requirements?",
								/*17*/ "A start-up company has a web application based in the us-east-1 Region with multiple Amazon EC2 instances running behind an Application LoadBalancer across multiple Availability Zones. As the company's user base grows in the us-west-1 Region, it needs a solution with low latency andhigh availability.What should a solutions architect do to accomplish this?",
								/*18*/ "A solutions architect is designing a solution to access a catalog of images and provide users with the ability to submit requests to customizeimages. Image customization parameters will be in any request sent to an AWS API Gateway API. The customized image will be generated ondemand, and users will receive a link they can click to view or download their customized image. The solution must be highly available for viewingand customizing images.What is the MOST cost-effective solution to meet these requirements?",
								/*19*/ "A company is planning to migrate a business-critical dataset to Amazon S3. The current solution design uses a single S3 bucket in the us-east-1Region with versioning enabled to store the dataset. The company's disaster recovery policy states that all data multiple AWS Regions.How should a solutions architect design the S3 solution?",
								/*20*/ "A company has application running on Amazon EC2 instances in a VPC. One of the applications needs to call an Amazon S3 API to store and readobjects. The company's security policies restrict any internet-bound trac from the applications.Which action will fulll these requirements and maintain security?",
								/*21*/ "A company's web application uses an Amazon RDS PostgreSQL DB instance to store its application data. During the nancial closing period at thestart of every month. Accountants run large queries that impact the database's performance due to high usage. The company wants to minimizethe impact that the reporting activity has on the web application.What should a solutions architect do to reduce the impact on the database with the LEAST amount of effort?",
								/*22*/ "A company wants to migrate a high performance computing (HPC) application and data from on-premises to the AWS Cloud. The company usestiered storage on premises with hot high-performance parallel storage to support the application during periodic runs of the application, and moreeconomical cold storage to hold the data when the application is not actively running.Which combination of solutions should a solutions architect recommend to support the storage needs of the application?",		
								//**Durdona Opa**//
								/*23*/ "A company's application is running on Amazon EC2 instances in a single Region. In the event of a disaster, a solutions architect needs to ensure that the resources can also be deployed to a second Region. Which combination of actions should the solutions architect take to accomplish this?",
								/*24*/ "A solutions architect needs to ensure that API calls to Amazon DynamoDB from Amazon EC2 instances in a VPC do not traverse the internet. What should the solutions architect do to accomplish this?",
								/*25*/ "A company's legacy application is currently relying on a single-instance Amazon RDS MySQL database without encryption. Due to new compliance requirements, all existing and new data in this database must be encrypted.How should this be accomplished?",
								/*26*/ "A manufacturing company wants to implement predictive maintenance on its machinery equipment. The company will install thousands of IoT sensors that will send data to AWS in real time. A solutions architect is tasked with implementing a solution that will receive events in an ordered manner for each machinery asset and ensure that data is saved for further processing at a later time. Which solution would be MOST ecient?",
								/*27*/ "A company's website runs on Amazon EC2 instances behind an Application Load Balancer (ALB). The website has a mix of dynamic and static content. Users around the globe are reporting that the website is slow. Which set of actions will improve website performance for users worldwide?",
								/*28*/ "A company has been storing analytics data in an Amazon RDS instance for the past few years. The company asked a solutions architect to nd asolution that allows users to access this data using an API. The expectation is that the application will experience periods of inactivity but could receive bursts of trac within seconds. Which solution should the solutions architect suggest?",
								/*29*/ "A company must generate sales reports at the beginning of every month. The reporting process launches 20 Amazon EC2 instances on the rst of the month. The process runs for 7 days and cannot be interrupted. The company wants to minimize costs. Which pricing model should the company choose?",
								/*30*/ "A gaming company has multiple Amazon EC2 instances in a single Availability Zone for its multiplayer game that communicates with users on Layer 4. The chief technology ocer (CTO) wants to make the architecture highly available and cost-effective. Which should a solutions architect do to meet these requirements?",
								/*31*/ "A company currently operates a web application backed by an Amazon RDS MySQL database. It has automated backups that are run daily and are not encrypted. A security audit requires future backups to be encrypted and the unencrypted backups to be destroyed. The company will make at least one encrypted backup before destroying the old backups. What should be done to enable encryption for future backups?",
								/*32*/ "A company is hosting a website behind multiple Application Load Balancers. The company has different distribution rights for its content around the world. A solutions architect needs to ensure that users are served the correct content without violating distribution rights. Which conguration should the solutions architect choose to meet these requirements?",
								/*33*/ "A solution architect has created a new AWS account and must secure AWS account root user access. Which combination of actions will accomplish this?",
								//**Lobarhon**//
								/*34*/ "A solutions architect at an ecommerce company wants to back up application log data to Amazon S3. The solutions architect is unsure how frequently the logs will be accessed or which logs will be accessed the most. The company wants to keep costs as low as possible by using the appropriate S3 storage class. Which S3 storage class should be implemented to meet these requirements?",
								/*35*/ "A company's website is used to sell products to the public. The site runs on Amazon EC2 instances in an Auto Scaling group behind an Application Load Balancer (ALB). There is also an Amazon CloudFront distribution, and AWS WAF is being used to protect against SQL injection attacks. The ALB is the origin for the CloudFront distribution. A recent review of security logs revealed an external malicious IP that needs to be blocked from accessing the website.What should a solutions architect do to protect the application?",
								/*36*/ "A solutions architect is designing an application for a two-step order process. The rst step is synchronous and must return to the user with little latency. The second step takes longer, so it will be implemented in a separate component. Orders must be processed exactly once and in the order in which they are received. How should the solutions architect integrate these components?",
								/*37*/ "A web application is deployed in the AWS Cloud. It consists of a two-tier architecture that includes a web layer and a database layer. The web server is vulnerable to cross-site scripting (XSS) attacks. What should a solutions architect do to remediate the vulnerability?",
								/*38*/ "A company's website is using an Amazon RDS MySQL Multi-AZ DB instance for its transactional data storage. There are other internal systemsthat query this DB instance to fetch data for internal batch processing. The RDS DB instance slows down signicantly the internal systems fetch data. This impacts the website's read and write performance, and the users experience slow response times. Which solution will improve the website's performance?",
								/*39*/ "An application runs on Amazon EC2 instances across multiple Availability Zones. The instances run in an Amazon EC2 Auto Scaling group behindan Application Load Balancer. The application performs best when the CPU utilization of the EC2 instances is at or near 40%. What should a solutions architect do to maintain the desired performance across all instances in the group?",
								/*40*/ "A company runs an internal browser-based application. The application runs on Amazon EC2 instances behind an Application Load Balancer. The instances run in an Amazon EC2 Auto Scaling group across multiple Availability Zones. The Auto Scaling group scales up to 20 instances during work hours, but scales down to 2 instances overnight. Staff are complaining that the application is very slow when the day begins, although it runs well by mid-morning. How should the scaling be changed to address the staff complaints and keep costs to a minimum?",
								/*41*/ "A nancial services company has a web application that serves users in the United States and Europe. The application consists of a database tier and a web server tier. The database tier consists of a MySQL database hosted in us-east-1. Amazon Route 53 geoproximity routing is used to direct trac to instances in the closest Region. A performance review of the system reveals that European users are not receiving the same level of query performance as those in the United States. Which changes should be made to the database tier to improve performance?",
								/*42*/ "A company hosts a static website on-premises and wants to migrate the website to AWS. The website should load as quickly as possible for users around the world. The company also wants the most cost-effective solution. What should a solutions architect do to accomplish this?",
								/*43*/ "A solutions architect is designing storage for a high performance computing (HPC) environment based on Amazon Linux. The workload stores and processes a large amount of engineering drawings that require shared storage and heavy computing. Which storage option would be the optimal solution?",
								/*44*/ "A company is performing an AWS Well-Architected Framework review of an existing workload deployed on AWS. The review identied a publicfacing website running on the same Amazon EC2 instance as a Microsoft Active Directory domain controller that was install recently to support other AWS services. A solutions architect needs to recommend a new design that would improve the security of the architecture and minimize the administrative demand on IT staff. What should the solutions architect recommend?",
								//**Khilola**//
								/*45*/ "A company hosts a static website within an Amazon S3 bucket. A solutions architect needs to ensure that data can be recovered in case of accidental deletion. Which action will accomplish this?",
								/*46*/ "A company's production application runs online transaction processing (OLTP) transactions on an Amazon RDS MySQL DB instance. The company is launching a new reporting tool that will access the same data. The reporting tool must be highly available and not impact the performance of the production application. How can this be achieved?",
								/*47*/ "A company runs an application in a branch office within a small data closet with no virtualized compute resources. The application data is stored on an NFS volume. Compliance standards require a daily offsite backup of the NFS volume. Which solution meet these requirements?",
								/*48*/ "A company's web application is using multiple Linux Amazon EC2 instances and storing data on Amazon EBS volumes. The company is looking for a solution to increase the resiliency of the application in case of a failure and to provide storage that complies with atomicity, consistency, isolation, and durability (ACID). What should a solutions architect do to meet these requirements?",
								/*49*/ "A security team to limit access to specific services or actions in all of the team's AWS accounts. All accounts belong to a large organization in AWS Organizations. The solution must be scalable and there must be a single point where permission can be maintained. What should a solutions architect do to accomplish this?",
								/*50*/ "A data science team requires storage for nightly log processing. The size and number of logs is unknown and will persist for 24 hours only. What is the MOST cost-effective solution?",
								/*51*/ "A company is hosting a web application on AWS using a single Amazon EC2 instance that stores user-uploaded documents in an Amazon EBS volume. For better scalability and availability, the company duplicated the architecture and created a second EC2 instance and EBS volume in another Availability Zone, placing both behind an Application Load Balancer. After completing this change, users reported that each time they refreshed the website, they could see one subset of their documents or the other, but never all of the documents at the same time. What should a solutions architect propose to ensure users see all of their documents at once?",
								/*52*/ "A company is planning to use Amazon S3 to store images uploaded by its users. The images must be encrypted at rest in Amazon S3. The company does not want to spend time managing and rotating the keys, but it does want to control who can access those keys. What should a solutions architect use to accomplish this?",
								/*53*/ "A company is running an ecommerce application on Amazon EC2. The application consists of a stateless web tier that requires a minimum of 10 instances, and a peak of 250 instances to support the application's usage. The application requires 50 instances 80% of the time. Which solution should be used to minimize costs?",
								/*54*/ "A company has deployed an API in a VPC behind an internet-facing Application Load Balancer (ALB). An application that consumes the API as a client is deployed in a second account in private subnets behind a NAT gateway. When requests to the client application increase, the NAT gateway costs are higher than expected. A solutions architect has configured the ALB to be internal. Which combination of architectural changes will reduce the NAT gateway costs?",
								/*55*/ "A solutions architect is tasked with transferring 750 TB of data from a network-attached le system located at a branch office Amazon S3 Glacier. The solution must avoid saturating the branch office's low-bandwidth internet connection. What is the MOST cost-effective solution?",
								//**Abdu**//
								/*56*/ "A company has a two-tier application architecture that runs in public and private subnets. Amazon EC2 instances running the web application arein the public subnet and a database runs on the private subnet. The web application instances and the database are running in a single Availability Zone (AZ). Which combination of steps should a solutions architect take to provide high availability for this architecture?",
								/*57*/ "A solutions architect is implementing a document review application using an Amazon S3 bucket for storage. The solution must prevent an accidental deletion of the documents and ensure that all versions of the documents are available. Users must be able to download, modify, and upload documents. Which combination of actions should be taken to meet these requirements?",
								/*58*/ "An application hosted on AWS is experiencing performance problems, and the application vendor wants to perform an analysis of the log le to troubleshoot further. The log le is stored on Amazon S3 and is 10 GB in size. The application owner will make the log le available to the vendor for a limited time. What is the MOST secure way to do this?",
								/*59*/ "A solutions architect is designing a two-tier web application. The application consists of a public-facing web tier hosted on Amazon EC2 in public subnets. The database tier consists of Microsoft SQL Server running on Amazon EC2 in a private subnet. Security is a high priority for the company. How should security groups be congured in this situation?",
								/*60*/ "A company allows its developers to attach existing IAM policies to existing IAM roles to enable faster experimentation and agility. However, the security operations team is concerned that the developers could attach the existing administrator policy, which would allow the developers to circumvent any other security policies.How should a solutions architect address this issue?",
								/*61*/ "A company has a multi-tier application that runs six front-end web servers in an Amazon EC2 Auto Scaling group in a single Availability Zone behind an Application Load Balancer (ALB). A solutions architect needs to modify the infrastructure to be highly available without modifying the application. Which architecture should the solutions architect choose that provides high availability?",
								/*62*/ "A company runs an application on a group of Amazon Linux EC2 instances. The application writes log les using standard API calls. For compliance reasons, all log les must be retained indenitely and will be analyzed by a reporting tool that must access all les concurrently. Which storage service should a solutions architect use to provide the MOST cost-effective solution?",
								/*63*/ "A media streaming company collects real-time data and stores it in a disk-optimized database system. The company is not getting the expected throughput and wants an in-memory database storage solution that performs faster and provides high availability using data replication. Which database should a solutions architect recommend?",
								/*64*/ "A company hosts its product information webpages on AWS. The existing solution uses multiple Amazon C2 instances behind an ApplicationLoad Balancer in an Auto Scaling group. The website also uses a custom DNS name and communicates with HTTPS only using a dedicated SSL certicate. The company is planning a new product launch and wants to be sure that users from around the world have the best possible experience on the new website. What should a solutions architect do to meet these requirements?",
								/*65*/ "A solutions architect is designing the cloud architecture for a new application being deployed on AWS. The process should run in parallel while adding and removing application nodes as needed based on the number of jobs to be processed. The processor application is stateless. The solutions architect must ensure that the application is loosely coupled and the job items are durably stored. Which design should the solutions architect use?",
								/*66*/ "A marketing company is storing CSV les in an Amazon S3 bucket for statistical analysis. An application on an Amazon EC2 instance needs permission to eciently process the CSV data stored in the S3 bucket. Which action will MOST securely grant the EC2 instance access to the S3 bucket?",
								//**Vosit**//
								/*67*/ "A company has on-premises servers running a relational database. The current database serves high read traffic for users in different locations. The company wants to migrate to AWS with the least amount of effort. The database solution should support disaster recovery and not affect the company's current traffic flow. Which solution meets these requirements?",
								/*68*/ "A company's application is running on Amazon EC2 instances within an Auto Scaling group behind an Elastic Load Balancer. Based on the application's history the company anticipates a spike in traffic during a holiday each year. A solutions architect must design a strategy to ensure that the Auto Scaling group proactively increases capacity to minimize any performance impact on application users. Which solution will meet these requirements?",
								/*69*/ "A company hosts an application on multiple Amazon EC2 instances. The application processes messages from an Amazon SQS queue, writes for an Amazon RDS table, and deletes - the message from the queue. Occasional duplicate records are found in the RDS table. The SQS queue does not contain any duplicate messages. What should a solutions architect do to ensure messages are being processed once only?",
								/*70*/
								/*71*/ "A solutions architect is optimizing a website for an upcoming musical event. Videos of the performances will be streamed in real time and then will be available on demand. The event is expected to attract a global online audience. Which service will improve the performance of both the real-time and on-demand steaming?"
						  };
	
	String[][] options =  {
								//** Edward-options**//
								/*1*/ {"Point a Route 53 alias record to an Amazon CloudFront distribution with the ALB as one of its origins. Then, create custom error pages for the distribution",
									   "Set up a Route 53 active-passive failover configuration. Direct traffic to a static error page hosted within an Amazon S3 bucket when Route 53 health checks determine that the ALB endpoint is unhealthy",
									   "Update the Route 53 record to use a latency-based routing policy. Add the backup static error page hosted within an Amazon S3 bucket to the record so the traffic is sent to the most responsive endpoints",
									   "Set up a Route 53 active-active configuration with the ALB and an Amazon EC2 instance hosting a static error page as endpoints. Route 53 will only send requests to the instance if the health checks fail for the ALB"},
								/*2*/ {"Launch the EC2 instances in a cluster placement group in one Availability Zone",
									   "Launch the EC2 instances in a spread placement group in one Availability Zone",
									   "Launch the EC2 instances in an Auto Scaling group in two Regions and peer the VPCs",
									   "Launch the EC2 instances in an Auto Scaling group spanning multiple Availability Zones"},
								/*3*/ {"Use Amazon S3 with Transfer Acceleration to host the application.",
									   "Use Amazon S3 with CacheControl headers to host the application.",
									   "Use Amazon EC2 with Auto Scaling and Amazon CloudFront to host the application.",
									   "Use Amazon EC2 with Auto Scaling and Amazon ElastiCache to host the application"},
								/*4*/ {"Amazon EFS",
									   "Amazon FSx", 
									   "Amazon S3",
									   "AWS Storage Gateway"},
								/*5*/ {"Implement code in microservice 1 to send data to an Amazon S3 bucket. Use S3 event notifications to invoke microservice 2.",
									   "Implement code in microservice 1 to publish data to an Amazon SNS topic. Implement code in microservice 2 to subscribe to this topic.",
									   "Implement code in microservice 1 to send data to Amazon Kinesis Data Firehose. Implement code in microservice 2 to read from Kinesis Data Firehose",
									   "Implement code in microservice 1 to send data to an Amazon SQS queue. Implement code in microservice 2 to process messages from the queue."}, 
								/*6*/ {"Amazon EC2, Amazon S3",
									   "AWS Lambda, Amazon Kinesis Data Firehose",
									   "Amazon Kinesis Data Streams",
									   "Amazon Kinesis Data Analytics"},
								/*7*/ {"Configure an Amazon CloudFront distribution in front of the ALB.",
									   "Configure an EC2 Auto Scaling simple scaling policy based on CPU utilization.",
									   "Configure an EC2 Auto Scaling scheduled scaling policy based on the monthly schedule.",
									   "Configure Amazon ElastiCache to remove some of the workload from the EC2 instances."}, 
								/*8*/ {"Add an Amazon CloudFront distribution in front of the Application Load Balancer",
									   "Add AWS Global Accelerator",
									   "A nad B answers",
									   "Add AWS Direct Connect"},
								/*9*/ {"Enable read-through caching on the Amazon Aurora database.",
									   "Update the application to read from the Multi-AZ standby instance.",
									   "Create a read replica and modify the application to use the appropriate endpoint.",
									   "B and C answers"}, 
								/*10*/ {"AWS Direct Connect for both the initial transfer and ongoing connectivity.",
									    "AWS Site-to-Site VPN for both the initial transfer and ongoing connectivity.",
									    "AWS Snowball for the initial transfer and AWS Direct Connect for ongoing connectivity.",
									    "AWS Snowball for the initial transfer and AWS Site-to-Site VPN for ongoing connectivity."},
								/*11*/ {"Store the data in an Amazon EBS volume. Mount the EBS volume on the application instances.",
									    "Store the data in an Amazon EFS file system. Mount the file system on the application instances.",
									    "Store the data in Amazon S3 Glacier. Update the vault policy to allow access to the application instances.",
									    "Store the data in Amazon S3 Standard-Infrequent Access (S3 Standard-IA). Update the bucket policy to allow access to the application instances."},
								//**Muzaffar aka-options**//	    
								/*12*/ {"Store the data in an Amazon EBS volume. Mount the EBS volume on the application instances",
										"Store the data in an Amazon EFS le system. Mount the le system on the application instances",
										"Store the data in Amazon S3 Glacier. Update the vault policy to allow access to the application instances",
										"Store the data in Amazon S3 Standard-Infrequent Access (S3 Standard-IA). Update the bucket policy to allow access to the applicationinstances"},
								/*13*/ {"Import the data into an Amazon DynamoDB table with provisioned capacity. Refactor the application to use DynamoDB for reports",
										"Create the database on a compute optimized Amazon EC2 instance. Ensure compute resources exceed the on-premises database",
										"Create an Amazon Aurora MySQL Multi-AZ DB cluster with multiple read replicas. Congure the application reader endpoint for reports",
										"Create an Amazon Aurora MySQL Multi-AZ DB cluster. Congure the application to use the backup instance of the cluster as an endpoint forthe reports"},
								/*14*/ {"Amazon EBS",
										"Amazon EC2 instance store",
										"Amazon EFS",
										"Amazon S3"},
								/*15*/ {"Generate presigned URLs for the les",
										"Use cross-Region replication to all Regions",
										"Use the geoproximity feature of Amazon Route 53",
										"Use Amazon CloudFront with the S3 bucket as its origin"},
								/*16*/ {"AWS Fargate",
										"AWS Lambda",
										"Amazon DynamoDB",
										"B and C answers"},
								/*17*/ {"Provision EC2 instances in us-west-1. Switch the Application Load Balancer to a Network Load Balancer to achieve cross-Region loadbalancing",
										"Provision EC2 instances and an Application Load Balancer in us-west-1. Make the load balancer distribute the trac based on the locationof the request",
										"Provision EC2 instances and congure an Application Load Balancer in us-west-1. Create an accelerator in AWS Global Accelerator thatuses an endpoint group that includes the load balancer endpoints in both Regions",
										"Provision EC2 instances and congure an Application Load Balancer in us-west-1. Congure Amazon Route 53 with a weighted routingpolicy. Create alias records in Route 53 that point to the Application Load Balancer"},
								/*18*/ {"Use Amazon EC2 instances to manipulate the original image into the requested customization. Store the original and manipulated imagesin Amazon S3. Congure an Elastic Load Balancer in front of the EC2 instances",
										"Use AWS Lambda to manipulate the original image to the requested customization. Store the original and manipulated images in AmazonS3. Congure an Amazon CloudFront distribution with the S3 bucket as the origin",
										"Use AWS Lambda to manipulate the original image to the requested customization. Store the original images in Amazon S3 and themanipulated images in Amazon DynamoDB. Congure an Elastic Load Balancer in front of the Amazon EC2 instances",
										"Use Amazon EC2 instances to manipulate the original image into the requested customization. Store the original images in Amazon S3 andthe manipulated images in Amazon DynamoDB. Congure an Amazon CloudFront distribution with the S3 bucket as the origin"},
								/*19*/ {"Create an additional S3 bucket in another Region and congure cross-Region replication",
										"Create an additional S3 bucket in another Region and congure cross-origin resource sharing (CORS)",
										"Create an additional S3 bucket with versioning in another Region and congure cross-Region replication",
										"Create an additional S3 bucket with versioning in another Region and congure cross-origin resource (CORS)"},
								/*20*/ {"Congure an S3 interface endpoint",
										"Congure an S3 gateway endpoint",
										"Create an S3 bucket in a private subnet",
										"Create an S3 bucket in the same Region as the EC2 instance"},
								/*21*/ {"Create a read replica and direct reporting trac to the replica",
										"Create a Multi-AZ database and direct reporting trac to the standby",
										"Create a cross-Region read replica and direct reporting trac to the replica",
										"Create an Amazon Redshift database and direct reporting trac to the Amazon Redshift database"},
								/*22*/ {"Amazon S3 for cold data storage",
										"Amazon FSx for Lustre for high-performance parallel storage",
										"A and B answers",
										"Amazon FSx for Windows for high-performance parallel storage"},
								//**Durdona Opa-options**//
								/*23*/ {"Launch a new EC2 instance from an Amazon Machine Image (AMI) in a new Region",
										"Launch a new EC2 instance in a new Region and copy a volume from Amazon S3 to the new instance",
										"Copy an Amazon Machine Image (AMI) of an EC2 instance and specify a different Region for the destination",
										"A and C answers"},
								/*24*/ {"Create a route table entry for the endpoint",
										"Create a gateway endpoint for DynamoDB",
										"A and B answers",
										"Create an ENI for the endpoint in each of the subnets of the VPC"},
								/*25*/ {"Create an Amazon S3 bucket with server-side encryption enabled. Move all the data to Amazon S3. Delete the RDS instance",
										"Enable RDS Multi-AZ mode with encryption at rest enabled. Perform a failover to the standby instance to delete the original instance",
										"Take a Snapshot of the RDS instance. Create an encrypted copy of the snapshot. Restore the RDS instance from the encrypted snapshot",
										"Create an RDS read replica with encryption at rest enabled. Promote the read replica to master and switch the over to the new master. Delete the old RDS instance"},
								/*26*/ {"Use Amazon Kinesis Data Streams for real-time events with a partition for each equipment asset. Use Amazon Kinesis Data Firehose to save data to Amazon S3",
										"Use Amazon Kinesis Data Streams for real-time events with a shard for each equipment asset. Use Amazon Kinesis Data Firehose to save data to Amazon EBS",
										"Use an Amazon SQS FIFO queue for real-time events with one queue for each equipment asset. Trigger an AWS Lambda function for the SQS queue to save data to Amazon EFS",
										"Use an Amazon SQS standard queue for real-time events with one queue for each equipment asset. Trigger an AWS Lambda function from the SQS queue to save data to Amazon S3"},
								/*27*/ {"Create an Amazon CloudFront distribution and congure the ALB as an origin. Then update the Amazon Route 53 record to point to the CloudFront 	distribution",
										"Create a latency-based Amazon Route 53 record for the ALB. Then launch new EC2 instances with larger instance sizes and register the instances the ALB",
										"Launch new EC2 instances hosting the same web application in different Regions closer to the users. Then register instances with thesame ALB using cross- Region VPC peering",
										"Host the website in an Amazon S3 bucket in the Regions closest to the users and delete the ALB and EC2 instances. Then update an Amazon Route 53 record to point to the S3 buckets"},
								/*28*/ {"Set up an Amazon API Gateway and use Amazon ECS",
										"Set up an Amazon API Gateway and use AWS Elastic Beanstalk",
										"Set up an Amazon API Gateway and use AWS Lambda functions", 
										"Set up an Amazon API Gateway and use Amazon EC2 with Auto Scaling"},
								/*29*/ {"Reserved Instances",
										"Spot Block Instances",
										"On-Demand Instances",
										"Scheduled Reserved Instances"},
								/*30*/ {"Congure an Auto Scaling group to add or remove instances in multiple Availability Zones automatically",
										"Decrease the number of EC2 instances",
										"Congure a Network Load Balancer in front of the EC2 instances",
										"A and C answers"},
								/*31*/ {"Enable default encryption for the Amazon S3 bucket where backups are stored",
										"Modify the backup section of the database conguration to toggle the Enable encryption check box",
										"Create a snapshot of the database. Copy it to an encrypted snapshot. Restore the database from the encrypted snapshot",
										"Enable an encrypted read replica on RDS for MySQL. Promote the encrypted read replica to primary. Remove the original database instance"},
								/*32*/ {"Congure Amazon CloudFront with AWS WAF",
										"Congure Application Load Balancers with AWS WAF",
										"Congure Amazon Route 53 with a geolocation policy",
										"A and C answers"},
								/*33*/ {"Enable multi-factor authentication to the root user",
										"Store root user access keys in an encrypted Amazon S3 bucket",
										"Add the root user to a group containing administrative permissions",
										"A and C answers"},
								//**Lobarhon-options**//
								/*34*/ {"S3 Glacier",
										"S3 Intelligent-Tiering",
										"A and B answers",
										"S3 One Zone-Infrequent Access (S3 One Zone-IA)"},
								/*35*/ {"Modify the network ACL on the CloudFront distribution to add a deny rule for the malicious IP address",
										"Modify the conguration of AWS WAF to add an IP match condition to block the malicious IP address",
										"Modify the network ACL for the EC2 instances in the target groups behind the ALB to deny the malicious IP address",
										"Modify the security groups for the EC2 instances in the target groups behind the ALB to deny the malicious IP address"},
								/*36*/ {"Use Amazon SQS FIFO queues",
										"Use an AWS Lambda function along with Amazon SQS standard queues",
										"Create an SNS topic and subscribe an Amazon SQS FIFO queue to that topic",
										"Create an SNS topic and subscribe an Amazon SQS Standard queue to that topic"},
								/*37*/ {"Create a Classic Load Balancer. Put the web layer behind the load balancer and enable AWS WAF",
										"Create a Network Load Balancer. Put the web layer behind the load balancer and enable AWS WAF",
										"Create an Application Load Balancer. Put the web layer behind the load balancer and enable AWS WAF",
										"Create an Application Load Balancer. Put the web layer behind the load balancer and use AWS Shield Standard"},
								/*38*/ {"Use an RDS PostgreSQL DB instance instead of a MySQL database",
										"Use Amazon ElastiCache to cache the query responses for the website",
										"Add an additional Availability Zone to the current RDS MySQL Multi.AZ DB instance",
										"Add a read replica to the RDS DB instance and congure the internal systems to query the read replica"},
								/*39*/ {"Use a simple scaling policy to dynamically scale the Auto Scaling group",
										"Use a target tracking policy to dynamically scale the Auto Scaling group",
										"Use an AWS Lambda function to update the desired Auto Scaling group capacity",
										"Use scheduled scaling actions to scale up and scale down the Auto Scaling group"},
								/*40*/ {"Implement a scheduled action that sets the desired capacity to 20 shortly before the oce opens.",
										"Implement a step scaling action triggered at a lower CPU threshold, and decrease the cooldown period",
										"Implement a target tracking action triggered at a lower CPU threshold, and decrease the cooldown period",
										"Implement a scheduled action that sets the minimum and maximum capacity to 20 shortly before the oce opens"},
								/*41*/ {"Migrate the database to Amazon RDS for MySQL. Congure Multi-AZ in one of the European Regions",
										"Migrate the database to Amazon DynamoDB. Use DynamoDB global tables to enable replication to additional Regions.",
										"Deploy MySQL instances in each Region. Deploy an Application Load Balancer in front of MySQL to reduce the load on the primary instance.",
										"Migrate the database to an Amazon Aurora global database in MySQL compatibility mode. Congure read replicas in one of the European Regions"},
								/*42*/ {"Copy the website content to an Amazon S3 bucket. Congure the bucket to serve static webpage content. Replicate the S3 bucket to multiple AWS Regions.",
										"Copy the website content to an Amazon S3 bucket. Congure the bucket to serve static webpage content. Congure Amazon CloudFront with the S3 bucket as the origin",
										"Copy the website content to an Amazon EBS-backed Amazon EC2 instance running Apache HTTP Server. Congure Amazon Route 53 geolocation routing policies to select the closest origin",
										"Copy the website content to multiple Amazon EBS-backed Amazon EC2 instances running Apache HTTP Server in multiple AWS Regions.Congure Amazon CloudFront geolocation routing policies to select the closest origin"},
								/*43*/ {"Amazon Elastic File System (Amazon EFS)",
										"Amazon FSx for Lustre",
										"Amazon EC2 instance store",
										"Amazon EBS Provisioned IOPS SSD (io1)"},
								/*44*/ {"Use AWS Directory Service to create a managed Active Directory. Uninstall Active Directory on the current EC2 instance",
										"Create another EC2 instance in the same subnet and reinstall Active Directory on it. Uninstall Active Directory.",
										"Use AWS Directory Service to create an Active Directory connector. Proxy Active Directory requests to the Active domain controller running on the current EC2 instance",
										"Enable AWS Single Sign-On (AWS SSO) with Security Assertion Markup Language (SAML) 2.0 federation with the current Active Directory controller. Modify the EC2 instance's security group to deny public access to Active Directory"},
								//**Khilola-options**//
								/*45*/ {"Enable Amazon S3 versioning",
										"Enable Amazon S3 Intelligent-Tiering",
										"Enable an Amazon S3 lifecycle policy",
										"Enable Amazon S3 cross-Region replication"},
								/*46*/ {"Create hourly snapshots of the production RDS DB instance",
										"Create a Multi-AZ RDS Read Replica of the production RDS DB instance", 
										"Create multiple RDS Read Replicas of the production RDS DB instance. Place the Read Replicas in an Auto Scaling group",
										"Create a Single-AZ RDS Read Replica of the production RDS DB instance. Create a second Single-AZ RDS Read Replica from the replica."},
								/*47*/ {"Install an AWS Storage Gateway le gateway on premises to replicate the data to Amazon S3",
										"Install an AWS Storage Gateway le gateway hardware appliance on premises to replicate the data to Amazon S3",
										"Install an AWS Storage Gateway volume gateway with stored volumes on premises to replicate the data to Amazon S3",
										"Install an AWS Storage Gateway volume gateway with cached volumes on premises to replicate the data to Amazon S3"},
								/*48*/ {"Launch the application on EC2 instances in each Availability Zone. Attach EBS volumes to each EC2 instance",
										"Create an Application Load Balancer with Auto Scaling groups across multiple Availability Zones. Mount an instance store on each EC2 instance",
										"Create an Application Load Balancer with Auto Scaling groups across multiple Availability Zones. Store data on Amazon EFS and mount a target on each instance",
										"A and C answers"},
								/*49*/ {"Create an ACL to provide access to the services or actions",
										"Create a security group to allow accounts and attach it to user groups",
										"Create cross-account roles in each account to deny access to the services or actions",
										"Create a service control policy in the root organizational unit to deny access to the services or actions"},
								/*50*/ {"Amazon S3 Glacier",
										"Amazon S3 Standard",
										"Amazon S3 Intelligent-Tiering",
										"Amazon S3 One Zone-Infrequent Access (S3 One Zone-IA)"},
								/*51*/ {"Copy the data so both EBS volumes contain all the documents",
										"Configure the Application Load Balancer to direct a user to the server with the documents",
										"Copy the data from both EBS volumes to Amazon EFS. Modify the application to save new documents to Amazon EFS",
										"Configure the Application Load Balancer to send the request to both servers. Return each document from the correct server"},
								/*52*/ {"Server-Side Encryption with keys stored in an S3 bucket",
										"Server-Side Encryption with Customer-Provided Keys (SSE-C)",
										"Server-Side Encryption with Amazon S3-Managed Keys (SSE-S3)",
										"Server-Side Encryption with AWS KMS-Managed Keys (SSE-KMS)"},
								/*53*/ {"Purchase Reserved Instances to cover 250 instances",
										"Purchase Reserved Instances to cover 80 instances. Use Spot Instances to cover the remaining instances",
										"Purchase On-Demand Instances to cover 40 instances. Use Spot Instances to cover the remaining instances",
										"Purchase Reserved Instances to cover 50 instances. Use On-Demand and Spot Instances to cover the remaining instances"},
								/*54*/ {"Configure a ClassicLink connection for the API into the client VPC. Access the API using the ClassicLink address",
										"Configure a PrivateLink connection for the API into the client VPC. Access the API using the PrivateLink address",
										"Configure an AWS Resource Access Manager connection between the two accounts. Access the API using the private address",
										"B and C answers"},
								/*55*/ {"Create a site-to-site VPN tunnel to an Amazon S3 bucket and transfer the les directly. Create a bucket VPC endpoint",
										"Order 10 AWS Snowball appliances and select an S3 Glacier vault as the destination. Create a bucket policy to enforce VPC endpoint",
										"Mount the network-attached le system to Amazon S3 and copy the les directly. Create a lifecycle policy to S3 objects to Amazon S3 Glacier",
										"Order 10 AWS Snowball appliances and select an Amazon S3 bucket as the destination. Create a lifecycle policy to transition the S3 objects to Amazon S3 Glacier"},
								//**Abdu-options**//
								/*56*/ {"Create an Amazon EC2 Auto Scaling group and Application Load Balancer spanning multiple AZs",
										"Add the existing web application instances to an Auto Scaling group behind an Application Load Balancer",
										"Create new public and private subnets in the same VPC, each in a new AZ. Migrate the database to an Amazon RDS multi-AZ deployment",
										"A and C answers"},
								/*57*/ {"Enable a read-only bucket ACL and Enable MFA Delete on the bucket",
										"Enable versioning on the bucket and Enable MFA Delete on the bucket",
										"Attach an IAM policy to the bucket and Encrypt the bucket using AWS KMS",
										"Enable MFA Delete on the bucket and Attach an IAM policy to the bucket"},
								/*58*/ {"Enable public read on the S3 object and provide the link to the vendor",
										"Upload the le to Amazon WorkDocs and share the public link with the vendor",
										"Generate a presigned URL and have the vendor download the log le before it expires",
										"A and C answers"},
								/*59*/ {"Congure the security group for the web tier to allow inbound trac on port 443 from 0.0.0.0/0 and Congure the security group for the web tier to allow outbound trac on port 443 from 0.0.0.0/0", 
										"Congure the security group for the database tier to allow inbound trac on port 1433 from the security group for the web tier",
										"Congure the security group for the database tier to allow outbound trac on ports 443 and 1433 to the security group for the web tier",
										"A and B answers"},
								/*60*/ {"Create an Amazon SNS topic to send an alert every time a developer creates a new policy",
										"Use service control policies to disable IAM activity across all account in the organizational unit",
										"Prevent the developers from attaching any policies and assign all IAM duties to the security operations",
										"Set an IAM permissions boundary on the developer IAM role that explicitly denies attaching the administrator policy"},
								/*61*/ {"Create an Auto Scaling group that uses three instances across each of two Regions",
										"Modify the Auto Scaling group to use three instances across each of two Availability Zones",
										"Create an Auto Scaling template that can be used to quickly create more instances in another Region",
										"Change the ALB in front of the Amazon EC2 instances in a round-robin conguration to balance trac to the web tier"},
								/*62*/ {"Amazon EBS",
										"Amazon EFS",
										"Amazon EC2 instance store",
										"Amazon S3"},
								/*63*/ {"Amazon RDS for MySQL",
										"Amazon RDS for PostgreSQL",
										"Amazon ElastiCache for Redis",
										"Amazon ElastiCache for Memcached"},
								/*64*/ {"Redesign the application to use Amazon CloudFront",
										"Redesign the application to use AWS Elastic Beanstalk",
										"Redesign the application to use a Network Load Balancer",
										"Redesign the application to use Amazon S3 static website hosting."},
								/*65*/ {"Create an Amazon SNS topic to send the jobs that need to be processed. Create an Amazon Machine Image (AMI) that consists of the processor application. Create a launch conguration that uses the AMI. Create an Auto Scaling group using the launch conguration. Set the scaling policy for the Auto Scaling group to add and remove nodes based on CPU usage",
										"Create an Amazon SQS queue to hold the jobs that need to be processed. Create an Amazon Machine Image (AMI) that consists of the processor application. Create a launch conguration that uses the AMI. Create an Auto Scaling group using the launch conguration. Set the scaling policy for the Auto Scaling group to add and remove nodes based on network usage",
										"Create an Amazon SQS queue to hold the jobs that need to be processed. Create an Amazon Machine Image (AMI) that consists of the processor application. Create a launch template that uses the AMI. Create an Auto Scaling group using the launch template. Set the scaling policy for the Auto Scaling group to add and remove nodes based on the number of items in the SQS queue",
										"Create an Amazon SNS topic to send the jobs that need to be processed. Create an Amazon Machine Image (AMI) that consists of the processor application. Create a launch template that uses the AMI. Create an Auto Scaling group using the launch template. Set the scaling policy for the Auto Scaling group to add and remove nodes based on the number of messages published to the SNS topic"},
								/*66*/ {"Attach a resource-based policy to the S3 bucket",
										"Create an IAM user for the application with specic permissions to the S3 bucket",
										"Associate an IAM role with least privilege permissions to the EC2 instance prole",
										"Store AWS credentials directly on the EC2 instance for applications on the instance to use for API calls"},
								//**Vosit-options**//
								/*67*/ {"Use a database in Amazon RDS with Multi-AZ and at least one read replica",
										"Use a database in Amazon RDS with Multi-AZ and at least one standby replica",
										"Use databases hosted on multiple Amazon EC2 instances in different AWS Regions",
										"Use databases hosted on Amazon EC2 instances behind an Application Load Balancer in different Availability Zones"},
								/*68*/ {"Create an Amazon CloudWatch alarm to scale up the EC2 instances when CPU utilization exceeds 90%",
										"Create a recurring scheduled action to scale up the Auto Scaling group before the expected period of peak demand",
										"Increase the minimum and maximum number of EC2 instances in the Auto Scaling group during the peak demand period",
										"Configure an Amazon Simple Notification Service (Amazon SNS) notification to send alerts when there are autoscaling EC2_INSTANCE_LAUNCH events"},
								/*69*/ {"Use the CreateQueue API call to create a new queue",
										"Use the AddPermission API call to add appropriate permissions",
										"Use the ReceiveMessage API call to set an appropriate wait time",
										"Use the ChangeMessageVisibility API call to increase the visibility timeout"},
								/*70*/
								/*71*/ {"Amazon CloudFront",
										"AWS Global Accelerator",
										"Amazon Route S3",
										"Amazon S3 Transfer Acceleration"}
						  };
	
	char[] answers =	  {
								//** Edward-answers**//
								/*1*/ 'B',
								/*2*/ 'A',
								/*3*/ 'C',
								/*4*/ 'B',
								/*5*/ 'C',
								/*6*/ 'B',
								/*7*/ 'C',
								/*8*/ 'C',
								/*9*/ 'C',
								/*10*/ 'C',
								/*11*/ 'C',
								//**Muzaffar aka-answers**//
								/*12*/ 'B',
								/*13*/ 'C',
								/*14*/ 'A',
								/*15*/ 'D',
								/*16*/ 'D',
								/*17*/ 'B',
								/*18*/ 'B',
								/*19*/ 'A',
								/*20*/ 'A',
								/*21*/ 'A',
								/*22*/ 'C',
								//**Durdona Opa-answers**//
								/*23*/ 'D',
								/*24*/ 'C',
								/*25*/ 'C',
								/*26*/ 'A',
								/*27*/ 'A',
								/*28*/ 'C',
								/*29*/ 'D',
								/*30*/ 'D',
								/*31*/ 'C',
								/*32*/ 'C',
								/*33*/ 'D',
								//**Lobarhon-answers**//
								/*34*/ 'B',
								/*35*/ 'B',
								/*36*/ 'C',
								/*37*/ 'C',
								/*38*/ 'D',
								/*39*/ 'B',
								/*40*/ 'A',
								/*41*/ 'C',
								/*42*/ 'B',
								/*43*/ 'B',
								/*44*/ 'A',
								//**Khilola-answers**//
								/*45*/ 'A',
								/*46*/ 'B',
								/*47*/ 'A',
								/*48*/ 'C',
								/*49*/ 'D',
								/*50*/ 'D',
								/*51*/ 'C',
								/*52*/ 'D',
								/*53*/ 'D',
								/*54*/ 'D',
								/*55*/ 'D',
								//**Abdu-answers**//
								/*56*/ 'D',
								/*57*/ 'B',
								/*58*/ 'C',
								/*59*/ 'D',
								/*60*/ 'D',
								/*61*/ 'B',
								/*62*/ 'D',
								/*63*/ 'C',
								/*64*/ 'A',
								/*65*/ 'C',
								//**Vosit-answers**//
								/*67*/ 'A',
								/*68*/ 'B',
								/*69*/ 'D',
								/*70*/
								/*71*/ 'A'
						  };
	char guess;
	char answer;
	int index;
	int correct_guesses;
	int total_questions = questions.length;
	int result;
	int seconds=300;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JScrollPane scrollableTextArea = new JScrollPane(textarea);
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JButton buttonRestart = new JButton();
	JTextArea answer_labelA = new JTextArea();
	JTextArea answer_labelB = new JTextArea();
	JTextArea answer_labelC = new JTextArea();
	JTextArea answer_labelD = new JTextArea();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	Timer timer = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			seconds--;
			seconds_left.setText(String.valueOf(seconds));
			if(seconds<=0) {
				displayAnswer();
			}
		}
	});
	
	public void Welcome() {
				
	}
	
	public Quiz() {
		
		/* Display frame */
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1280,680);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);
		
		/* Frame display number of question */
		textfield.setBounds(0,0,1230,25);
		textfield.setBackground(new Color(51,153,255));
		textfield.setForeground(new Color(255,255,255));
		textfield.setFont(new Font("Arial",Font.PLAIN,18));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		/* Frame display questions */
		textarea.setBounds(0,25,1260,150);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(50,50,50));
		textarea.setForeground(new Color(255,255,255));
		textarea.setFont(new Font("Arial",Font.PLAIN,18));
		textarea.setEditable(false);
		textarea.setVisible(true);
		
		/* Set up ScrollPane */
		scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		/* Button display A */
		buttonA.setBounds(0,180,50,100);
		buttonA.setFont(new Font("Arial",Font.PLAIN,18));
		buttonA.setFocusable(false);
		buttonA.setBackground(new Color(51,153,255));
		buttonA.setForeground(new Color(255,255,255));
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		/* Button display B */
		buttonB.setBounds(0,285,50,100);
		buttonB.setFont(new Font("Arial",Font.PLAIN,18));
		buttonB.setFocusable(false);
		buttonB.setForeground(new Color(255,255,255));
		buttonB.setBackground(new Color(51,153,255));
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		/* Button display C */
		buttonC.setBounds(0,390,50,100);
		buttonC.setFont(new Font("Arial",Font.PLAIN,18));
		buttonC.setFocusable(false);
		buttonC.setForeground(new Color(255,255,255));
		buttonC.setBackground(new Color(51,153,255));
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		/* Button display D */
		buttonD.setBounds(0,495,50,100);
		buttonD.setFont(new Font("Arial",Font.PLAIN,18));
		buttonD.setForeground(new Color(255,255,255));
		buttonD.setFocusable(false);
		buttonD.setBackground(new Color(51,153,255));
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		/* Button display Restart */
		buttonRestart.setBounds(500,599,200,40);
		buttonRestart.setFont(new Font("Times New Roman",Font.PLAIN,18));
		buttonRestart.setFocusable(false);
		buttonRestart.addActionListener(this);
		
		/* Display A option */
		answer_labelA.setBounds(50,180,1215,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(51,204,51));
		answer_labelA.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelA.setLineWrap(true);
		answer_labelA.setWrapStyleWord(true);
		answer_labelA.setBorder(BorderFactory.createBevelBorder(1));
		answer_labelA.setEditable(false);
			
		/* Display B options */
		answer_labelB.setBounds(50,285,1215,100);
		answer_labelB.setBackground(new Color(50,50,50));
		answer_labelB.setForeground(new Color(51,204,51));
		answer_labelB.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelB.setLineWrap(true);
		answer_labelB.setWrapStyleWord(true);
		answer_labelB.setBorder(BorderFactory.createBevelBorder(1));
		answer_labelB.setEditable(false);
		
		/* Display C option */
		answer_labelC.setBounds(50,390,1215,100);
		answer_labelC.setBackground(new Color(50,50,50));
		answer_labelC.setForeground(new Color(51,204,51));
		answer_labelC.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelC.setLineWrap(true);
		answer_labelC.setWrapStyleWord(true);
		answer_labelC.setBorder(BorderFactory.createBevelBorder(1));
		answer_labelC.setEditable(false);
			
		/* Display D poption */
		answer_labelD.setBounds(50,495,1215,100);
		answer_labelD.setBackground(new Color(50,50,50));
		answer_labelD.setForeground(new Color(51,204,51));
		answer_labelD.setFont(new Font("Arial",Font.PLAIN,18));
		answer_labelD.setLineWrap(true);
		answer_labelD.setWrapStyleWord(true);
		answer_labelD.setBorder(BorderFactory.createBevelBorder(1));
		answer_labelD.setEditable(false);
		
		/* Display timer */ 
		seconds_left.setBounds(1230,0,35,25);
		seconds_left.setBackground(new Color(25,25,25));
		seconds_left.setForeground(new Color(255,0,0));
		seconds_left.setFont(new Font("Arial",Font.PLAIN,18));
		seconds_left.setBorder(BorderFactory.createBevelBorder(1));
		seconds_left.setOpaque(true);
		seconds_left.setHorizontalAlignment(JTextField.CENTER);
		seconds_left.setText(String.valueOf(seconds));
		
		/* Display number of right answers */
		number_right.setBounds(500,185,200,90);
		number_right.setBackground(new Color(25,25,25));
		number_right.setForeground(new Color(25,225,0));
		number_right.setFont(new Font("Times New Roman",Font.BOLD,50));
		number_right.setHorizontalAlignment(JTextField.CENTER);
		number_right.setEditable(false);
		
		/* Display percentage of result */
		percentage.setBounds(500,395,200,90);
		percentage.setBackground(new Color(25,25,25));
		percentage.setForeground(new Color(25,225,0));
		percentage.setFont(new Font("Times New Roman",Font.BOLD,50));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
		/* Adding components to frame */
		frame.add(time_label);
		frame.add(seconds_left);
		frame.add(answer_labelA);
		frame.add(answer_labelB);
		frame.add(answer_labelC);
		frame.add(answer_labelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea, BorderLayout.CENTER);
		frame.add(textfield);
		frame.getContentPane().add(scrollableTextArea);
		frame.setVisible(true);
		
		nextQuestion();
	}
	
	/* Locate options to positions */
	public void nextQuestion() {
		
		if(index>=total_questions) {
			results();
		}else {
			textfield.setText("Question "+(index+1));
			textarea.setText(questions[index]);
			answer_labelA.setText(options[index][0]);
			answer_labelB.setText(options[index][1]);
			answer_labelC.setText(options[index][2]);
			answer_labelD.setText(options[index][3]);
			timer.start();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if (e.getSource() == buttonA) {
			answer='A';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		if (e.getSource() == buttonB) {
			answer='B';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		if (e.getSource() == buttonC) {
			answer='C';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		if (e.getSource() == buttonD) {
			answer='D';
			if(answer == answers[index]) {
				correct_guesses++;
			}
		}
		
		displayAnswer();
	}
	
	public void displayAnswer() {
		
		timer.stop();
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if(answers[index] != 'A')
			answer_labelA.setForeground(new Color(255,0,0));
		if(answers[index] != 'B')
			answer_labelB.setForeground(new Color(255,0,0));
		if(answers[index] != 'C')
			answer_labelC.setForeground(new Color(255,0,0));
		if(answers[index] != 'D')
			answer_labelD.setForeground(new Color(255,0,0));
		
		Timer pause = new Timer(3000, new  ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				answer_labelA.setForeground(new Color(51,204,51));
				answer_labelB.setForeground(new Color(51,204,51));
				answer_labelC.setForeground(new Color(51,204,51));
				answer_labelD.setForeground(new Color(51,204,51)); 
				
				answer = ' ';
				seconds=300;
				seconds_left.setText(String.valueOf(seconds));
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				index++;
				nextQuestion();
			}
		});
		
		pause.setRepeats(false);
		pause.start();
	}
	
	public void results() {
			
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		result = (int)((correct_guesses/(double)total_questions)*100);
		
		textfield.setText("RESULTS!");
		textarea.setText("");
		answer_labelA.setText("");
		answer_labelB.setText("");
		answer_labelC.setText("");
		answer_labelD.setText("");
		
		frame.add(buttonRestart);
		buttonRestart.setText("TRY AGAIN!");
		
		buttonRestart.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Quiz quiz = new Quiz();
				quiz.nextQuestion();
			}
		});

		
		number_right.setText("("+correct_guesses+"/"+total_questions+")");
		percentage.setText(result+"%");
		
		
		frame.add(number_right);
		frame.add(percentage);
	}
}
