name := "$name$"

version := "0.0.1"

organization := "$package$"

scalaVersion := "2.9.1"

resolvers ++= Seq(
	"snapshots"	at "http://oss.sonatype.org/content/repositories/snapshots",
	"releases"	at "http://oss.sonatype.org/content/repositories/releases"
)

seq( webSettings :_* )

scalacOptions ++= Seq("-deprecation", "-unchecked")

libraryDependencies ++= {
	val liftVersion = "2.4"
	Seq(
		"net.liftweb"					%% "lift-webkit"		    % liftVersion			            % "compile",
		"org.eclipse.jetty"	 		    %  "jetty-webapp"			% "7.5.4.v20111024"	                % "container; test",
		"ch.qos.logback"		 		%  "logback-classic"		% "1.0.6",
		"org.scalatest"				    %% "scalatest"				% "2.0.M3"				            % "test"
  	)
}

port in container.Configuration := 8080