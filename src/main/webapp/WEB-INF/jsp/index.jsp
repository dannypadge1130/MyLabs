<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<jsp:include page="includes/globalcss.jsp"></jsp:include>

<title>Dan Padgett - Labs</title>
</head>
	<body>
	
	<jsp:include page="includes/header.jsp"></jsp:include>
		
	<!-- Fixed navbar -->
	<div class="navbar navbar-default navbar-fixed-top" role="navigation">
	  <div class="container">
	    <div class="navbar-header">
	      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
	        <span class="sr-only">Toggle navigation</span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	        <span class="icon-bar"></span>
	      </button>
	      <a class="navbar-brand">My Labs</a>
	    </div>
	    <div class="navbar-collapse collapse">
	      <ul class="nav navbar-nav">
	        <li class="active"><g:link mapping="homepage">Home</g:link></li>
	        <li><g:link mapping="about">About</g:link></li>
	        <li><g:link mapping="contact">Contact</g:link></li>
	      </ul>
	    </div><!--/.nav-collapse -->
	  </div>
	</div>
	
	<div class="container">
		<div class="page-header">
			<b>Build Me Some Grails</b> - <em>11/24/2014</em>
		</div>
		<div class="container">
			<p>Because my overwhelming need to be organized and lazy I decided to setup a centralized build setup for this site and other grails sites I maintain.</p>
			
			<p>First I did some research on 3rd party hosted CI tools. I mean, why re-invent the wheel? (Am I right or Am I right or Am I right.. right..) Their are a quite a few out there, and more popping up each day.  But, as many grails developers know, grails is a hidden gem and isn't supported by many 3rd party tools yet. So, I wasn't able to find a 3rd party CI that supported grails and fulfilled my personal checklist. So that meant I have to host it myself. Ugh...</p>
			
			<p>I looked into 2 of what I consider to be the most popular build tools out, QuickBuild and Jenkins.  After reviewing both, I decided to go with QuickBuild (Jenkins cult, please don't cut me). Although both are viable options what pulled me toward QuickBuild was that its GUI was a little more User Friendly, I liked its inheritance model, and that it provided the option of write groovy scripts.</p>
			
			<p>Hosting and setting up QuickBuild was a breeze. I built it out on an old laptop running Ubuntu. I setup SSH, and just port forwarded QuickBuilds default port 8810 to run my builds.  I ran build/deploys out this way for several months and truly enjoyed it.  It was really nice while it lasted, but like all good things they must be destroyed by a dummy messing with environment variables.  Yes.. Yes.. I drank some dumb person juice and started messing around with ROOT environment variables and destroyed my Ubuntu installation.... lol.</p>
			
			<p>Because of pure laziness of not wanted to setup QuickBuild again.  I told myself "Hey Dan, just write you're own scripts..", So I did.</p>
			
			<p>I wrote two separate scripts a build script and a deploy script.  Both of these are extremely basic, and I provided overviews of both below.</p>
		</div>
		
		<div class="container">
			<b>Build Script:</b>
			<pre class="prettyprint"><code class="prettyprint lang-sh">cd /Users/dan.padgett/Development/build-space
git clone git@github.com:dannypadge1130/labs.git
cd labs/mylabs/

grails clean
grails prod war

scp -i /Users/dan.padgett/Development/keys/dansapp.pem /Users/dan.padgett/Development/build-space/labs/mylabs/target/mylabs-0.1.war ubuntu@54.55.55.555:/home/ubuntu/mylabs-builds/

ssh -i /Users/dan.padgett/Development/keys/dansapp.pem ubuntu@55.55.55.555 'sh /home/ubuntu/build-scripts/mylabs-deploy.sh'</code></pre>
		</div>
		
		<div class="container">
			<b>Overview:</b>
			<ol type="1">
				<li>First I defined a directory to clone my repository and build out my application.  In the case of this script that directory is "build-space."</li>
				<li>Once cloned I run a clean and then the production war script.</li>
				<li>Once my application is bundled in my war file, I run out a secure copy paste to my EC2 instance.</li>
				<li>After the war file is uploaded to EC2, I invoke by deploy script which is sitting on my EC2 instance.</li>
			</ol>
		</div>
		
		<div class="container">
			<b>Deploy Script:</b>
			<pre class="prettyprint"><code class="prettyprint lang-sh">timestamp=$(date +%s)
newFileName='mylabs'$timestamp'.war'
mv /home/ubuntu/mylabs-builds/mylabs-0.1.war /home/ubuntu/mylabs-builds/$newFileName
				
sudo service tomcat7 stop
				
sudo cp -rf /home/ubuntu/mylabs-builds/$newFileName /var/lib/tomcat7/webapps/mylabs.war
				
sudo chmod 664 /var/lib/tomcat7/webapps/mylabs.war
sudo chown tomcat7: /var/lib/tomcat7/webapps/mylabs.war 
				
sudo service tomcat7 start</code></pre>
		</div>
		
		<div class="container">
			<b>Overview:</b>
			<ol type="1">
				<li>Archive my build war file.</li>
				<li>Stop Tomcat, and overwrite old war with new.</li>
				<li>Give the war file the proper permissions. Then start up Tomcat.</li>
			</ol>
		</div>
	</div>

		<jsp:include page="includes/footer.jsp"></jsp:include>
		
		<jsp:include page="includes/globaljs.jsp"></jsp:include>
	
		<script type="text/javascript">
			(function(jQuery){
			  jQuery( document ).ready( function() {
			    prettyPrint();
			  } );
			}(jQuery))
		</script>
	</body>
</html>