Created a maven project:
Then added dependency for derby in the pom as shown below
<dependency>
      <groupId>org.apache.derby</groupId>
      <artifactId>derby</artifactId>
      <version>10.14.2.0</version>
      <scope>test</scope>
    </dependency>
  
Then created a folder through below code and implemented jdbc concept as shown below
Connection conn;
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
       // System.out.println( "Hello World!" );
    	App obj=new App();
    	obj.connectionDB();
       }
    public void connectionDB() throws SQLException,ClassNotFoundException
    {
    	 String dburl="jdbc.derby:myDB;create=true";
         String driver="org.apache.derby.jdbc.EmbeddedDriver";
         Class.forName(driver);
     
    }
    public void getdetails() throws SQLException
    {
    	Statement stmt=conn.createStatement(); 
    	System.out.println("Creating table");
    	
    	String sql = "CREATE table USERS(id INTEGER ,name VARCHAR(255))";
        stmt.executeUpdate(sql);
        System.out.println("inserting data");
    	
        String insert1="insert into USERS  (1,'madhu')";
        String insert2="insert into USERS  (2,'madhukar')";
        String insert3="insert into USERS  (3,'madhukar sadula')";
        stmt.executeUpdate(insert1);
        stmt.executeUpdate(insert2);
        stmt.executeUpdate(insert3);
        String selectquery="select * from USERS";
      ResultSet rs=stmt.executeQuery(selectquery);  
    	//String insert1="";
      
      System.out.println("getting data from table");
    	while(rs.next())  
    	System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
    	conn.close();  
    }

Package:

Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T22:11:47+05:30)
Maven home: E:\NewDevEnvi\Assignment3\EMBEDDED
Java version: 1.8.0_121, vendor: Oracle Corporation
Java home: C:\Program Files\Java\jdk1.8.0_121\jre
Default locale: en_IN, platform encoding: Cp1252
OS name: "windows 8.1", version: "6.3", arch: "amd64", family: "dos"
[DEBUG] Created new class realm maven.api
[DEBUG] Importing foreign packages into class realm maven.api
[DEBUG]   Imported: javax.enterprise.inject.* < plexus.core
[DEBUG]   Imported: javax.enterprise.util.* < plexus.core
[DEBUG]   Imported: javax.inject.* < plexus.core
[DEBUG]   Imported: org.apache.maven.* < plexus.core
[DEBUG]   Imported: org.apache.maven.artifact < plexus.core
[DEBUG]   Imported: org.apache.maven.classrealm < plexus.core
[DEBUG]   Imported: org.apache.maven.cli < plexus.core
[DEBUG]   Imported: org.apache.maven.configuration < plexus.core
[DEBUG]   Imported: org.apache.maven.exception < plexus.core
[DEBUG]   Imported: org.apache.maven.execution < plexus.core
[DEBUG]   Imported: org.apache.maven.execution.scope < plexus.core
[DEBUG]   Imported: org.apache.maven.lifecycle < plexus.core
[DEBUG]   Imported: org.apache.maven.model < plexus.core
[DEBUG]   Imported: org.apache.maven.monitor < plexus.core
[DEBUG]   Imported: org.apache.maven.plugin < plexus.core
[DEBUG]   Imported: org.apache.maven.profiles < plexus.core
[DEBUG]   Imported: org.apache.maven.project < plexus.core
[DEBUG]   Imported: org.apache.maven.reporting < plexus.core
[DEBUG]   Imported: org.apache.maven.repository < plexus.core
[DEBUG]   Imported: org.apache.maven.rtinfo < plexus.core
[DEBUG]   Imported: org.apache.maven.settings < plexus.core
[DEBUG]   Imported: org.apache.maven.toolchain < plexus.core
[DEBUG]   Imported: org.apache.maven.usability < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.* < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.authentication < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.authorization < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.events < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.observers < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.proxy < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.repository < plexus.core
[DEBUG]   Imported: org.apache.maven.wagon.resource < plexus.core
[DEBUG]   Imported: org.codehaus.classworlds < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.* < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.classworlds < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.component < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.configuration < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.container < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.context < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.lifecycle < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.logging < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.personality < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.Xpp3Dom < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlPullParser < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlPullParserException < plexus.core
[DEBUG]   Imported: org.codehaus.plexus.util.xml.pull.XmlSerializer < plexus.core
[DEBUG]   Imported: org.eclipse.aether.* < plexus.core
[DEBUG]   Imported: org.eclipse.aether.artifact < plexus.core
[DEBUG]   Imported: org.eclipse.aether.collection < plexus.core
[DEBUG]   Imported: org.eclipse.aether.deployment < plexus.core
[DEBUG]   Imported: org.eclipse.aether.graph < plexus.core
[DEBUG]   Imported: org.eclipse.aether.impl < plexus.core
[DEBUG]   Imported: org.eclipse.aether.installation < plexus.core
[DEBUG]   Imported: org.eclipse.aether.internal.impl < plexus.core
[DEBUG]   Imported: org.eclipse.aether.metadata < plexus.core
[DEBUG]   Imported: org.eclipse.aether.repository < plexus.core
[DEBUG]   Imported: org.eclipse.aether.resolution < plexus.core
[DEBUG]   Imported: org.eclipse.aether.spi < plexus.core
[DEBUG]   Imported: org.eclipse.aether.transfer < plexus.core
[DEBUG]   Imported: org.eclipse.aether.version < plexus.core
[DEBUG]   Imported: org.slf4j.* < plexus.core
[DEBUG]   Imported: org.slf4j.helpers.* < plexus.core
[DEBUG]   Imported: org.slf4j.spi.* < plexus.core
[DEBUG] Populating class realm maven.api
[INFO] Error stacktraces are turned on.
[DEBUG] Reading global settings from EMBEDDED\conf\settings.xml
[DEBUG] Reading user settings from C:\Users\madhukar sadula\.m2\settings.xml
[DEBUG] Reading global toolchains from EMBEDDED\conf\toolchains.xml
[DEBUG] Reading user toolchains from C:\Users\madhukar sadula\.m2\toolchains.xml
[DEBUG] Using local repository at C:\Users\madhukar sadula\.m2\repository
[DEBUG] Using manager EnhancedLocalRepositoryManager with priority 10.0 for C:\Users\madhukar sadula\.m2\repository
[INFO] Scanning for projects...
[DEBUG] Extension realms for project com.wipro.topgear:Assignment3:jar:0.0.1-SNAPSHOT: (none)
[DEBUG] Looking up lifecyle mappings for packaging jar from ClassRealm[plexus.core, parent: null]
[DEBUG] === REACTOR BUILD PLAN ================================================
[DEBUG] Project: com.wipro.topgear:Assignment3:jar:0.0.1-SNAPSHOT
[DEBUG] Tasks:   [package]
[DEBUG] Style:   Regular
[DEBUG] =======================================================================
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Assignment3 0.0.1-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] Lifecycle default -> [validate, initialize, generate-sources, process-sources, generate-resources, process-resources, compile, process-classes, generate-test-sources, process-test-sources, generate-test-resources, process-test-resources, test-compile, process-test-classes, test, prepare-package, package, pre-integration-test, integration-test, post-integration-test, verify, install, deploy]
[DEBUG] Lifecycle clean -> [pre-clean, clean, post-clean]
[DEBUG] Lifecycle site -> [pre-site, site, post-site, site-deploy]
[DEBUG] === PROJECT BUILD PLAN ================================================
[DEBUG] Project:       com.wipro.topgear:Assignment3:0.0.1-SNAPSHOT
[DEBUG] Dependencies (collect): []
[DEBUG] Dependencies (resolve): [compile, runtime, test]
[DEBUG] Repositories (dependencies): [central (https://repo.maven.apache.org/maven2, default, releases)]
[DEBUG] Repositories (plugins)     : [central (https://repo.maven.apache.org/maven2, default, releases)]
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-resources-plugin:2.6:resources (default-resources)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <buildFilters default-value="${project.build.filters}"/>
  <encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
  <escapeString>${maven.resources.escapeString}</escapeString>
  <escapeWindowsPaths default-value="true">${maven.resources.escapeWindowsPaths}</escapeWindowsPaths>
  <includeEmptyDirs default-value="false">${maven.resources.includeEmptyDirs}</includeEmptyDirs>
  <outputDirectory default-value="${project.build.outputDirectory}"/>
  <overwrite default-value="false">${maven.resources.overwrite}</overwrite>
  <project default-value="${project}"/>
  <resources default-value="${project.resources}"/>
  <session default-value="${session}"/>
  <supportMultiLineFiltering default-value="false">${maven.resources.supportMultiLineFiltering}</supportMultiLineFiltering>
  <useBuildFilters default-value="true"/>
  <useDefaultDelimiters default-value="true"/>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-compiler-plugin:3.1:compile (default-compile)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <basedir default-value="${basedir}"/>
  <buildDirectory default-value="${project.build.directory}"/>
  <classpathElements default-value="${project.compileClasspathElements}"/>
  <compileSourceRoots default-value="${project.compileSourceRoots}"/>
  <compilerId default-value="javac">${maven.compiler.compilerId}</compilerId>
  <compilerReuseStrategy default-value="${reuseCreated}">${maven.compiler.compilerReuseStrategy}</compilerReuseStrategy>
  <compilerVersion>${maven.compiler.compilerVersion}</compilerVersion>
  <debug default-value="true">${maven.compiler.debug}</debug>
  <debuglevel>${maven.compiler.debuglevel}</debuglevel>
  <encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
  <executable>${maven.compiler.executable}</executable>
  <failOnError default-value="true">${maven.compiler.failOnError}</failOnError>
  <forceJavacCompilerUse default-value="false">${maven.compiler.forceJavacCompilerUse}</forceJavacCompilerUse>
  <fork default-value="false">${maven.compiler.fork}</fork>
  <generatedSourcesDirectory default-value="${project.build.directory}/generated-sources/annotations"/>
  <maxmem>${maven.compiler.maxmem}</maxmem>
  <meminitial>${maven.compiler.meminitial}</meminitial>
  <mojoExecution>${mojoExecution}</mojoExecution>
  <optimize default-value="false">${maven.compiler.optimize}</optimize>
  <outputDirectory default-value="${project.build.outputDirectory}"/>
  <projectArtifact default-value="${project.artifact}"/>
  <showDeprecation default-value="false">${maven.compiler.showDeprecation}</showDeprecation>
  <showWarnings default-value="false">${maven.compiler.showWarnings}</showWarnings>
  <skipMain>${maven.main.skip}</skipMain>
  <skipMultiThreadWarning default-value="false">${maven.compiler.skipMultiThreadWarning}</skipMultiThreadWarning>
  <source default-value="1.5">${maven.compiler.source}</source>
  <staleMillis default-value="0">${lastModGranularityMs}</staleMillis>
  <target default-value="1.5">${maven.compiler.target}</target>
  <useIncrementalCompilation default-value="true">${maven.compiler.useIncrementalCompilation}</useIncrementalCompilation>
  <verbose default-value="false">${maven.compiler.verbose}</verbose>
  <mavenSession default-value="${session}"/>
  <session default-value="${session}"/>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-resources-plugin:2.6:testResources (default-testResources)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <buildFilters default-value="${project.build.filters}"/>
  <encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
  <escapeString>${maven.resources.escapeString}</escapeString>
  <escapeWindowsPaths default-value="true">${maven.resources.escapeWindowsPaths}</escapeWindowsPaths>
  <includeEmptyDirs default-value="false">${maven.resources.includeEmptyDirs}</includeEmptyDirs>
  <outputDirectory default-value="${project.build.testOutputDirectory}"/>
  <overwrite default-value="false">${maven.resources.overwrite}</overwrite>
  <project default-value="${project}"/>
  <resources default-value="${project.testResources}"/>
  <session default-value="${session}"/>
  <skip>${maven.test.skip}</skip>
  <supportMultiLineFiltering default-value="false">${maven.resources.supportMultiLineFiltering}</supportMultiLineFiltering>
  <useBuildFilters default-value="true"/>
  <useDefaultDelimiters default-value="true"/>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile (default-testCompile)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <basedir default-value="${basedir}"/>
  <buildDirectory default-value="${project.build.directory}"/>
  <classpathElements default-value="${project.testClasspathElements}"/>
  <compileSourceRoots default-value="${project.testCompileSourceRoots}"/>
  <compilerId default-value="javac">${maven.compiler.compilerId}</compilerId>
  <compilerReuseStrategy default-value="${reuseCreated}">${maven.compiler.compilerReuseStrategy}</compilerReuseStrategy>
  <compilerVersion>${maven.compiler.compilerVersion}</compilerVersion>
  <debug default-value="true">${maven.compiler.debug}</debug>
  <debuglevel>${maven.compiler.debuglevel}</debuglevel>
  <encoding default-value="${project.build.sourceEncoding}">${encoding}</encoding>
  <executable>${maven.compiler.executable}</executable>
  <failOnError default-value="true">${maven.compiler.failOnError}</failOnError>
  <forceJavacCompilerUse default-value="false">${maven.compiler.forceJavacCompilerUse}</forceJavacCompilerUse>
  <fork default-value="false">${maven.compiler.fork}</fork>
  <generatedTestSourcesDirectory default-value="${project.build.directory}/generated-test-sources/test-annotations"/>
  <maxmem>${maven.compiler.maxmem}</maxmem>
  <meminitial>${maven.compiler.meminitial}</meminitial>
  <mojoExecution>${mojoExecution}</mojoExecution>
  <optimize default-value="false">${maven.compiler.optimize}</optimize>
  <outputDirectory default-value="${project.build.testOutputDirectory}"/>
  <showDeprecation default-value="false">${maven.compiler.showDeprecation}</showDeprecation>
  <showWarnings default-value="false">${maven.compiler.showWarnings}</showWarnings>
  <skip>${maven.test.skip}</skip>
  <skipMultiThreadWarning default-value="false">${maven.compiler.skipMultiThreadWarning}</skipMultiThreadWarning>
  <source default-value="1.5">${maven.compiler.source}</source>
  <staleMillis default-value="0">${lastModGranularityMs}</staleMillis>
  <target default-value="1.5">${maven.compiler.target}</target>
  <testSource>${maven.compiler.testSource}</testSource>
  <testTarget>${maven.compiler.testTarget}</testTarget>
  <useIncrementalCompilation default-value="true">${maven.compiler.useIncrementalCompilation}</useIncrementalCompilation>
  <verbose default-value="false">${maven.compiler.verbose}</verbose>
  <mavenSession default-value="${session}"/>
  <session default-value="${session}"/>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <argLine>${argLine}</argLine>
  <basedir default-value="${basedir}"/>
  <childDelegation default-value="false">${childDelegation}</childDelegation>
  <classesDirectory default-value="${project.build.outputDirectory}"/>
  <debugForkedProcess>${maven.surefire.debug}</debugForkedProcess>
  <disableXmlReport default-value="false">${disableXmlReport}</disableXmlReport>
  <enableAssertions default-value="true">${enableAssertions}</enableAssertions>
  <excludedGroups>${excludedGroups}</excludedGroups>
  <failIfNoSpecifiedTests>${surefire.failIfNoSpecifiedTests}</failIfNoSpecifiedTests>
  <failIfNoTests>${failIfNoTests}</failIfNoTests>
  <forkMode default-value="once">${forkMode}</forkMode>
  <forkedProcessTimeoutInSeconds>${surefire.timeout}</forkedProcessTimeoutInSeconds>
  <groups>${groups}</groups>
  <junitArtifactName default-value="junit:junit">${junitArtifactName}</junitArtifactName>
  <jvm>${jvm}</jvm>
  <localRepository default-value="${localRepository}"/>
  <objectFactory>${objectFactory}</objectFactory>
  <parallel>${parallel}</parallel>
  <parallelMavenExecution default-value="${session.parallel}"/>
  <perCoreThreadCount default-value="true">${perCoreThreadCount}</perCoreThreadCount>
  <pluginArtifactMap>${plugin.artifactMap}</pluginArtifactMap>
  <pluginDescriptor default-value="${plugin}"/>
  <printSummary default-value="true">${surefire.printSummary}</printSummary>
  <projectArtifactMap>${project.artifactMap}</projectArtifactMap>
  <redirectTestOutputToFile default-value="false">${maven.test.redirectTestOutputToFile}</redirectTestOutputToFile>
  <remoteRepositories default-value="${project.pluginArtifactRepositories}"/>
  <reportFormat default-value="brief">${surefire.reportFormat}</reportFormat>
  <reportNameSuffix default-value="">${surefire.reportNameSuffix}</reportNameSuffix>
  <reportsDirectory default-value="${project.build.directory}/surefire-reports"/>
  <runOrder default-value="filesystem"/>
  <skip default-value="false">${maven.test.skip}</skip>
  <skipExec>${maven.test.skip.exec}</skipExec>
  <skipTests default-value="false">${skipTests}</skipTests>
  <test>${test}</test>
  <testClassesDirectory default-value="${project.build.testOutputDirectory}"/>
  <testFailureIgnore default-value="false">${maven.test.failure.ignore}</testFailureIgnore>
  <testNGArtifactName default-value="org.testng:testng">${testNGArtifactName}</testNGArtifactName>
  <testSourceDirectory default-value="${project.build.testSourceDirectory}"/>
  <threadCount>${threadCount}</threadCount>
  <trimStackTrace default-value="true">${trimStackTrace}</trimStackTrace>
  <useFile default-value="true">${surefire.useFile}</useFile>
  <useManifestOnlyJar default-value="true">${surefire.useManifestOnlyJar}</useManifestOnlyJar>
  <useSystemClassLoader default-value="true">${surefire.useSystemClassLoader}</useSystemClassLoader>
  <useUnlimitedThreads default-value="false">${useUnlimitedThreads}</useUnlimitedThreads>
  <workingDirectory>${basedir}</workingDirectory>
  <project default-value="${project}"/>
  <session default-value="${session}"/>
</configuration>
[DEBUG] -----------------------------------------------------------------------
[DEBUG] Goal:          org.apache.maven.plugins:maven-jar-plugin:2.4:jar (default-jar)
[DEBUG] Style:         Regular
[DEBUG] Configuration: <?xml version="1.0" encoding="UTF-8"?>
<configuration>
  <classesDirectory default-value="${project.build.outputDirectory}"/>
  <defaultManifestFile default-value="${project.build.outputDirectory}/META-INF/MANIFEST.MF"/>
  <finalName default-value="${project.build.finalName}">${jar.finalName}</finalName>
  <forceCreation default-value="false">${jar.forceCreation}</forceCreation>
  <outputDirectory default-value="${project.build.directory}"/>
  <project default-value="${project}"/>
  <session default-value="${session}"/>
  <skipIfEmpty default-value="false">${jar.skipIfEmpty}</skipIfEmpty>
  <useDefaultManifestFile default-value="false">${jar.useDefaultManifestFile}</useDefaultManifestFile>
</configuration>
[DEBUG] =======================================================================
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=2, ConflictMarker.markTime=1, ConflictMarker.nodeCount=3, ConflictIdSorter.graphTime=1, ConflictIdSorter.topsortTime=2, ConflictIdSorter.conflictIdCount=2, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=0, ConflictResolver.conflictItemCount=2, DefaultDependencyCollector.collectTime=31, DefaultDependencyCollector.transformTime=11}
[DEBUG] com.wipro.topgear:Assignment3:jar:0.0.1-SNAPSHOT
[DEBUG]    junit:junit:jar:3.8.1:test
[DEBUG]    org.apache.derby:derby:jar:10.14.2.0:test
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ Assignment3 ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=0, ConflictMarker.markTime=0, ConflictMarker.nodeCount=77, ConflictIdSorter.graphTime=0, ConflictIdSorter.topsortTime=0, ConflictIdSorter.conflictIdCount=26, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=0, ConflictResolver.conflictItemCount=74, DefaultDependencyCollector.collectTime=297, DefaultDependencyCollector.transformTime=0}
[DEBUG] org.apache.maven.plugins:maven-resources-plugin:jar:2.6:
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-project:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-profile:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-artifact-manager:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-plugin-registry:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-core:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-plugin-parameter-documenter:jar:2.0.6:compile
[DEBUG]       org.apache.maven.reporting:maven-reporting-api:jar:2.0.6:compile
[DEBUG]          org.apache.maven.doxia:doxia-sink-api:jar:1.0-alpha-7:compile
[DEBUG]       org.apache.maven:maven-repository-metadata:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-error-diagnostics:jar:2.0.6:compile
[DEBUG]       commons-cli:commons-cli:jar:1.0:compile
[DEBUG]       org.apache.maven:maven-plugin-descriptor:jar:2.0.6:compile
[DEBUG]       org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4:compile
[DEBUG]       classworlds:classworlds:jar:1.1:compile
[DEBUG]    org.apache.maven:maven-artifact:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-settings:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-model:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-monitor:jar:2.0.6:compile
[DEBUG]    org.codehaus.plexus:plexus-container-default:jar:1.0-alpha-9-stable-1:compile
[DEBUG]       junit:junit:jar:3.8.1:compile
[DEBUG]    org.codehaus.plexus:plexus-utils:jar:2.0.5:compile
[DEBUG]    org.apache.maven.shared:maven-filtering:jar:1.1:compile
[DEBUG]       org.sonatype.plexus:plexus-build-api:jar:0.0.4:compile
[DEBUG]    org.codehaus.plexus:plexus-interpolation:jar:1.13:compile
[DEBUG] Created new class realm plugin>org.apache.maven.plugins:maven-resources-plugin:2.6
[DEBUG] Importing foreign packages into class realm plugin>org.apache.maven.plugins:maven-resources-plugin:2.6
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.apache.maven.plugins:maven-resources-plugin:2.6
[DEBUG]   Included: org.apache.maven.plugins:maven-resources-plugin:jar:2.6
[DEBUG]   Included: org.apache.maven.reporting:maven-reporting-api:jar:2.0.6
[DEBUG]   Included: org.apache.maven.doxia:doxia-sink-api:jar:1.0-alpha-7
[DEBUG]   Included: commons-cli:commons-cli:jar:1.0
[DEBUG]   Included: org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4
[DEBUG]   Included: junit:junit:jar:3.8.1
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:2.0.5
[DEBUG]   Included: org.apache.maven.shared:maven-filtering:jar:1.1
[DEBUG]   Included: org.sonatype.plexus:plexus-build-api:jar:0.0.4
[DEBUG]   Included: org.codehaus.plexus:plexus-interpolation:jar:1.13
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-resources-plugin:2.6:resources from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-resources-plugin:2.6, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-resources-plugin:2.6:resources' with basic configurator -->
[DEBUG]   (f) buildFilters = []
[DEBUG]   (f) encoding = UTF-8
[DEBUG]   (f) escapeWindowsPaths = true
[DEBUG]   (s) includeEmptyDirs = false
[DEBUG]   (s) outputDirectory = E:\NewDevEnvi\Assignment3\target\classes
[DEBUG]   (s) overwrite = false
[DEBUG]   (f) project = MavenProject: com.wipro.topgear:Assignment3:0.0.1-SNAPSHOT @ E:\NewDevEnvi\Assignment3\pom.xml
[DEBUG]   (s) resources = [Resource {targetPath: null, filtering: false, FileSet {directory: E:\NewDevEnvi\Assignment3\src\main\resources, PatternSet [includes: {}, excludes: {}]}}]
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG]   (f) supportMultiLineFiltering = false
[DEBUG]   (f) useBuildFilters = true
[DEBUG]   (s) useDefaultDelimiters = true
[DEBUG] -- end configuration --
[DEBUG] properties used {java.vendor=Oracle Corporation, env.SYSTEMROOT=C:\Windows, env.USERDOMAIN_ROAMINGPROFILE=useer, sun.java.launcher=SUN_STANDARD, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.name=Windows 8.1, env.PYTHONPATH=C:\Python34\;C:\Python34\Scripts;, env.FP_NO_HOST_CHECK=NO, sun.boot.class.path=C:\Program Files\Java\jdk1.8.0_121\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_121\jre\classes, env.COMPUTERNAME=USEER, env.ALLUSERSPROFILE=C:\ProgramData, sun.desktop=windows, java.vm.specification.vendor=Oracle Corporation, java.runtime.version=1.8.0_121-b13, env.HOMEPATH=\Users\madhukar sadula, project.build.sourceEncoding=UTF-8, user.name=madhukar.sadula, maven.build.version=Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T22:11:47+05:30), env.PATH=C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin/server;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/lib/amd64;C:\Program Files\Java\jdk1.8.0_121\bin;C:\Program Files\MySQL\MySQL Utilities 1.6\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\Scripts\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\;C:\Program Files\Java\jdk1.8.0_121\bin;E:\Softwares\apache-maven-3.5.4\bin;;E:\eclipse;, user.language=en, env.WINDIR=C:\Windows, sun.boot.library.path=C:\Program Files\Java\jdk1.8.0_121\jre\bin, classworlds.conf=E:\NewDevEnvi\.metadata\.plugins\org.eclipse.m2e.launching\launches\m2conf2539952340273307302.tmp, java.version=1.8.0_121, env.PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 58 Stepping 9, GenuineIntel, user.timezone=Asia/Calcutta, env.TEMP=C:\Users\MADHUK~1\AppData\Local\Temp, sun.arch.data.model=64, java.endorsed.dirs=C:\Program Files\Java\jdk1.8.0_121\jre\lib\endorsed, sun.cpu.isalist=amd64, env.HOMEDRIVE=C:, sun.jnu.encoding=Cp1252, file.encoding.pkg=sun.io, env.VS110COMNTOOLS=C:\Program Files (x86)\Microsoft Visual Studio 11.0\Common7\Tools\, env.SYSTEMDRIVE=C:, file.separator=\, java.specification.name=Java Platform API Specification, java.class.version=52.0, org.slf4j.simpleLogger.defaultLogLevel=debug, user.country=IN, java.home=C:\Program Files\Java\jdk1.8.0_121\jre, env.APPDATA=C:\Users\madhukar sadula\AppData\Roaming, env.PUBLIC=C:\Users\Public, java.vm.info=mixed mode, env.OS=Windows_NT, os.version=6.3, path.separator=;, java.vm.version=25.121-b13, env.USERPROFILE=C:\Users\madhukar sadula, user.variant=, env.JAVA_HOME=C:\Program Files\Java\jdk1.8.0_121, java.awt.printerjob=sun.awt.windows.WPrinterJob, env.TMP=C:\Users\MADHUK~1\AppData\Local\Temp, env.PROGRAMFILES=C:\Program Files, sun.io.unicode.encoding=UnicodeLittle, awt.toolkit=sun.awt.windows.WToolkit, user.script=, user.home=C:\Users\madhukar sadula, env.COMMONPROGRAMFILES=C:\Program Files\Common Files, env.SESSIONNAME=Console, java.specification.vendor=Oracle Corporation, env.CLASS PATH=E:\Workplace\hibernate-release-5.3.2.Final\lib, env.CLASSPATH=C:\Program Files\Java\jdk1.8.0_121\lib, env.M2_HOME=E:\Softwares\apache-maven-3.5.4, env.NUMBER_OF_PROCESSORS=4, java.library.path=C:\Program Files\Java\jdk1.8.0_121\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin/server;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/lib/amd64;C:\Program Files\Java\jdk1.8.0_121\bin;C:\Program Files\MySQL\MySQL Utilities 1.6\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\Scripts\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\;C:\Program Files\Java\jdk1.8.0_121\bin;E:\Softwares\apache-maven-3.5.4\bin;;E:\eclipse;;., java.vendor.url=http://java.oracle.com/, env.COMMONPROGRAMFILES(X86)=C:\Program Files (x86)\Common Files, env.PSMODULEPATH=C:\Windows\system32\WindowsPowerShell\v1.0\Modules\, java.vm.vendor=Oracle Corporation, maven.home=E:\NewDevEnvi\Assignment3\EMBEDDED, java.runtime.name=Java(TM) SE Runtime Environment, sun.java.command=org.codehaus.plexus.classworlds.launcher.Launcher -B -X package, java.class.path=/E:/eclipse/plugins/org.eclipse.m2e.maven.runtime_1.7.0.20160603-1931/jars/plexus-classworlds-2.5.2.jar, env.PROGRAMW6432=C:\Program Files, maven.version=3.3.9, env.PROGRAMFILES(X86)=C:\Program Files (x86), java.vm.specification.name=Java Virtual Machine Specification, env.LOGONSERVER=\\USEER, java.vm.specification.version=1.8, env.PROCESSOR_ARCHITECTURE=AMD64, env.COMMONPROGRAMW6432=C:\Program Files\Common Files, sun.cpu.endian=little, sun.os.patch.level=, env.ANT_HOME=E:\Softwares\apache-ant-1.10.5, env.PROCESSOR_REVISION=3a09, java.io.tmpdir=C:\Users\MADHUK~1\AppData\Local\Temp\, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, maven.multiModuleProjectDirectory=E:\NewDevEnvi\Assignment3, env.PROGRAMDATA=C:\ProgramData, env.COMSPEC=C:\Windows\system32\cmd.exe, os.arch=amd64, java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment, java.ext.dirs=C:\Program Files\Java\jdk1.8.0_121\jre\lib\ext;C:\Windows\Sun\Java\lib\ext, env.LOCALAPPDATA=C:\Users\madhukar sadula\AppData\Local, user.dir=E:\NewDevEnvi\Assignment3, line.separator=
, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, env.PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC;.PY, env.M2=E:\Softwares\apache-maven-3.5.4\bin, env.USERNAME=madhukar.sadula, file.encoding=Cp1252, env.USERDOMAIN=useer, java.specification.version=1.8, env.=C:=C:\, env.PROCESSOR_LEVEL=6}
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[DEBUG] resource with targetPath null
directory E:\NewDevEnvi\Assignment3\src\main\resources
excludes []
includes []
[INFO] skip non existing resourceDirectory E:\NewDevEnvi\Assignment3\src\main\resources
[DEBUG] no use filter components
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ Assignment3 ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=0, ConflictMarker.markTime=0, ConflictMarker.nodeCount=160, ConflictIdSorter.graphTime=0, ConflictIdSorter.topsortTime=0, ConflictIdSorter.conflictIdCount=43, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=15, ConflictResolver.conflictItemCount=63, DefaultDependencyCollector.collectTime=500, DefaultDependencyCollector.transformTime=15}
[DEBUG] org.apache.maven.plugins:maven-compiler-plugin:jar:3.1:
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.0.9:compile
[DEBUG]    org.apache.maven:maven-artifact:jar:2.0.9:compile
[DEBUG]       org.codehaus.plexus:plexus-utils:jar:1.5.1:compile
[DEBUG]    org.apache.maven:maven-core:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-settings:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-plugin-parameter-documenter:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-profile:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-model:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-repository-metadata:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-error-diagnostics:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-project:jar:2.0.9:compile
[DEBUG]          org.apache.maven:maven-plugin-registry:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-plugin-descriptor:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-artifact-manager:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-monitor:jar:2.0.9:compile
[DEBUG]    org.apache.maven:maven-toolchain:jar:1.0:compile
[DEBUG]    org.apache.maven.shared:maven-shared-utils:jar:0.1:compile
[DEBUG]       com.google.code.findbugs:jsr305:jar:2.0.1:compile
[DEBUG]    org.apache.maven.shared:maven-shared-incremental:jar:1.1:compile
[DEBUG]       org.codehaus.plexus:plexus-component-annotations:jar:1.5.5:compile
[DEBUG]    org.codehaus.plexus:plexus-compiler-api:jar:2.2:compile
[DEBUG]    org.codehaus.plexus:plexus-compiler-manager:jar:2.2:compile
[DEBUG]    org.codehaus.plexus:plexus-compiler-javac:jar:2.2:runtime
[DEBUG]    org.codehaus.plexus:plexus-container-default:jar:1.5.5:compile
[DEBUG]       org.codehaus.plexus:plexus-classworlds:jar:2.2.2:compile
[DEBUG]       org.apache.xbean:xbean-reflect:jar:3.4:compile
[DEBUG]          log4j:log4j:jar:1.2.12:compile
[DEBUG]          commons-logging:commons-logging-api:jar:1.1:compile
[DEBUG]       com.google.collections:google-collections:jar:1.0:compile
[DEBUG]       junit:junit:jar:3.8.2:compile
[DEBUG] Created new class realm plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1
[DEBUG] Importing foreign packages into class realm plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1
[DEBUG]   Included: org.apache.maven.plugins:maven-compiler-plugin:jar:3.1
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:1.5.1
[DEBUG]   Included: org.apache.maven.shared:maven-shared-utils:jar:0.1
[DEBUG]   Included: com.google.code.findbugs:jsr305:jar:2.0.1
[DEBUG]   Included: org.apache.maven.shared:maven-shared-incremental:jar:1.1
[DEBUG]   Included: org.codehaus.plexus:plexus-component-annotations:jar:1.5.5
[DEBUG]   Included: org.codehaus.plexus:plexus-compiler-api:jar:2.2
[DEBUG]   Included: org.codehaus.plexus:plexus-compiler-manager:jar:2.2
[DEBUG]   Included: org.codehaus.plexus:plexus-compiler-javac:jar:2.2
[DEBUG]   Included: org.apache.xbean:xbean-reflect:jar:3.4
[DEBUG]   Included: log4j:log4j:jar:1.2.12
[DEBUG]   Included: commons-logging:commons-logging-api:jar:1.1
[DEBUG]   Included: com.google.collections:google-collections:jar:1.0
[DEBUG]   Included: junit:junit:jar:3.8.2
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-compiler-plugin:3.1:compile from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-compiler-plugin:3.1:compile' with basic configurator -->
[DEBUG]   (f) basedir = E:\NewDevEnvi\Assignment3
[DEBUG]   (f) buildDirectory = E:\NewDevEnvi\Assignment3\target
[DEBUG]   (f) classpathElements = [E:\NewDevEnvi\Assignment3\target\classes]
[DEBUG]   (f) compileSourceRoots = [E:\NewDevEnvi\Assignment3\src\main\java]
[DEBUG]   (f) compilerId = javac
[DEBUG]   (f) debug = true
[DEBUG]   (f) encoding = UTF-8
[DEBUG]   (f) failOnError = true
[DEBUG]   (f) forceJavacCompilerUse = false
[DEBUG]   (f) fork = false
[DEBUG]   (f) generatedSourcesDirectory = E:\NewDevEnvi\Assignment3\target\generated-sources\annotations
[DEBUG]   (f) mojoExecution = org.apache.maven.plugins:maven-compiler-plugin:3.1:compile {execution: default-compile}
[DEBUG]   (f) optimize = false
[DEBUG]   (f) outputDirectory = E:\NewDevEnvi\Assignment3\target\classes
[DEBUG]   (f) projectArtifact = com.wipro.topgear:Assignment3:jar:0.0.1-SNAPSHOT
[DEBUG]   (f) showDeprecation = false
[DEBUG]   (f) showWarnings = false
[DEBUG]   (f) skipMultiThreadWarning = false
[DEBUG]   (f) source = 1.5
[DEBUG]   (f) staleMillis = 0
[DEBUG]   (f) target = 1.5
[DEBUG]   (f) useIncrementalCompilation = true
[DEBUG]   (f) verbose = false
[DEBUG]   (f) mavenSession = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG] -- end configuration --
[DEBUG] Using compiler 'javac'.
[DEBUG] Source directories: [E:\NewDevEnvi\Assignment3\src\main\java]
[DEBUG] Classpath: [E:\NewDevEnvi\Assignment3\target\classes]
[DEBUG] Output directory: E:\NewDevEnvi\Assignment3\target\classes
[DEBUG] CompilerReuseStrategy: reuseCreated
[DEBUG] useIncrementalCompilation enabled
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ Assignment3 ---
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-resources-plugin:2.6:testResources from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-resources-plugin:2.6, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-resources-plugin:2.6:testResources' with basic configurator -->
[DEBUG]   (f) buildFilters = []
[DEBUG]   (f) encoding = UTF-8
[DEBUG]   (f) escapeWindowsPaths = true
[DEBUG]   (s) includeEmptyDirs = false
[DEBUG]   (s) outputDirectory = E:\NewDevEnvi\Assignment3\target\test-classes
[DEBUG]   (s) overwrite = false
[DEBUG]   (f) project = MavenProject: com.wipro.topgear:Assignment3:0.0.1-SNAPSHOT @ E:\NewDevEnvi\Assignment3\pom.xml
[DEBUG]   (s) resources = [Resource {targetPath: null, filtering: false, FileSet {directory: E:\NewDevEnvi\Assignment3\src\test\resources, PatternSet [includes: {}, excludes: {}]}}]
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG]   (f) supportMultiLineFiltering = false
[DEBUG]   (f) useBuildFilters = true
[DEBUG]   (s) useDefaultDelimiters = true
[DEBUG] -- end configuration --
[DEBUG] properties used {java.vendor=Oracle Corporation, env.SYSTEMROOT=C:\Windows, env.USERDOMAIN_ROAMINGPROFILE=useer, sun.java.launcher=SUN_STANDARD, sun.management.compiler=HotSpot 64-Bit Tiered Compilers, os.name=Windows 8.1, env.PYTHONPATH=C:\Python34\;C:\Python34\Scripts;, env.FP_NO_HOST_CHECK=NO, sun.boot.class.path=C:\Program Files\Java\jdk1.8.0_121\jre\lib\resources.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\rt.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\sunrsasign.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\jsse.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\jce.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\charsets.jar;C:\Program Files\Java\jdk1.8.0_121\jre\lib\jfr.jar;C:\Program Files\Java\jdk1.8.0_121\jre\classes, env.COMPUTERNAME=USEER, env.ALLUSERSPROFILE=C:\ProgramData, sun.desktop=windows, java.vm.specification.vendor=Oracle Corporation, java.runtime.version=1.8.0_121-b13, env.HOMEPATH=\Users\madhukar sadula, project.build.sourceEncoding=UTF-8, user.name=madhukar.sadula, maven.build.version=Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T22:11:47+05:30), env.PATH=C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin/server;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/lib/amd64;C:\Program Files\Java\jdk1.8.0_121\bin;C:\Program Files\MySQL\MySQL Utilities 1.6\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\Scripts\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\;C:\Program Files\Java\jdk1.8.0_121\bin;E:\Softwares\apache-maven-3.5.4\bin;;E:\eclipse;, user.language=en, env.WINDIR=C:\Windows, sun.boot.library.path=C:\Program Files\Java\jdk1.8.0_121\jre\bin, classworlds.conf=E:\NewDevEnvi\.metadata\.plugins\org.eclipse.m2e.launching\launches\m2conf2539952340273307302.tmp, java.version=1.8.0_121, env.PROCESSOR_IDENTIFIER=Intel64 Family 6 Model 58 Stepping 9, GenuineIntel, user.timezone=Asia/Calcutta, env.TEMP=C:\Users\MADHUK~1\AppData\Local\Temp, sun.arch.data.model=64, java.endorsed.dirs=C:\Program Files\Java\jdk1.8.0_121\jre\lib\endorsed, sun.cpu.isalist=amd64, env.HOMEDRIVE=C:, sun.jnu.encoding=Cp1252, file.encoding.pkg=sun.io, env.VS110COMNTOOLS=C:\Program Files (x86)\Microsoft Visual Studio 11.0\Common7\Tools\, env.SYSTEMDRIVE=C:, file.separator=\, java.specification.name=Java Platform API Specification, java.class.version=52.0, org.slf4j.simpleLogger.defaultLogLevel=debug, user.country=IN, java.home=C:\Program Files\Java\jdk1.8.0_121\jre, env.APPDATA=C:\Users\madhukar sadula\AppData\Roaming, env.PUBLIC=C:\Users\Public, java.vm.info=mixed mode, env.OS=Windows_NT, os.version=6.3, path.separator=;, java.vm.version=25.121-b13, env.USERPROFILE=C:\Users\madhukar sadula, user.variant=, env.JAVA_HOME=C:\Program Files\Java\jdk1.8.0_121, java.awt.printerjob=sun.awt.windows.WPrinterJob, env.TMP=C:\Users\MADHUK~1\AppData\Local\Temp, env.PROGRAMFILES=C:\Program Files, sun.io.unicode.encoding=UnicodeLittle, awt.toolkit=sun.awt.windows.WToolkit, user.script=, user.home=C:\Users\madhukar sadula, env.COMMONPROGRAMFILES=C:\Program Files\Common Files, env.SESSIONNAME=Console, java.specification.vendor=Oracle Corporation, env.CLASS PATH=E:\Workplace\hibernate-release-5.3.2.Final\lib, env.CLASSPATH=C:\Program Files\Java\jdk1.8.0_121\lib, env.M2_HOME=E:\Softwares\apache-maven-3.5.4, env.NUMBER_OF_PROCESSORS=4, java.library.path=C:\Program Files\Java\jdk1.8.0_121\bin;C:\Windows\Sun\Java\bin;C:\Windows\system32;C:\Windows;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin/server;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/bin;C:/Program Files/Java/jdk1.8.0_121/bin/../jre/lib/amd64;C:\Program Files\Java\jdk1.8.0_121\bin;C:\Program Files\MySQL\MySQL Utilities 1.6\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\Scripts\;C:\Users\madhukar sadula\AppData\Local\Programs\Python\Python37-32\;C:\Program Files\Java\jdk1.8.0_121\bin;E:\Softwares\apache-maven-3.5.4\bin;;E:\eclipse;;., java.vendor.url=http://java.oracle.com/, env.COMMONPROGRAMFILES(X86)=C:\Program Files (x86)\Common Files, env.PSMODULEPATH=C:\Windows\system32\WindowsPowerShell\v1.0\Modules\, java.vm.vendor=Oracle Corporation, maven.home=E:\NewDevEnvi\Assignment3\EMBEDDED, java.runtime.name=Java(TM) SE Runtime Environment, sun.java.command=org.codehaus.plexus.classworlds.launcher.Launcher -B -X package, java.class.path=/E:/eclipse/plugins/org.eclipse.m2e.maven.runtime_1.7.0.20160603-1931/jars/plexus-classworlds-2.5.2.jar, env.PROGRAMW6432=C:\Program Files, maven.version=3.3.9, env.PROGRAMFILES(X86)=C:\Program Files (x86), java.vm.specification.name=Java Virtual Machine Specification, env.LOGONSERVER=\\USEER, java.vm.specification.version=1.8, env.PROCESSOR_ARCHITECTURE=AMD64, env.COMMONPROGRAMW6432=C:\Program Files\Common Files, sun.cpu.endian=little, sun.os.patch.level=, env.ANT_HOME=E:\Softwares\apache-ant-1.10.5, env.PROCESSOR_REVISION=3a09, java.io.tmpdir=C:\Users\MADHUK~1\AppData\Local\Temp\, java.vendor.url.bug=http://bugreport.sun.com/bugreport/, maven.multiModuleProjectDirectory=E:\NewDevEnvi\Assignment3, env.PROGRAMDATA=C:\ProgramData, env.COMSPEC=C:\Windows\system32\cmd.exe, os.arch=amd64, java.awt.graphicsenv=sun.awt.Win32GraphicsEnvironment, java.ext.dirs=C:\Program Files\Java\jdk1.8.0_121\jre\lib\ext;C:\Windows\Sun\Java\lib\ext, env.LOCALAPPDATA=C:\Users\madhukar sadula\AppData\Local, user.dir=E:\NewDevEnvi\Assignment3, line.separator=
, java.vm.name=Java HotSpot(TM) 64-Bit Server VM, env.PATHEXT=.COM;.EXE;.BAT;.CMD;.VBS;.VBE;.JS;.JSE;.WSF;.WSH;.MSC;.PY, env.M2=E:\Softwares\apache-maven-3.5.4\bin, env.USERNAME=madhukar.sadula, file.encoding=Cp1252, env.USERDOMAIN=useer, java.specification.version=1.8, env.=C:=C:\, env.PROCESSOR_LEVEL=6}
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[DEBUG] resource with targetPath null
directory E:\NewDevEnvi\Assignment3\src\test\resources
excludes []
includes []
[INFO] skip non existing resourceDirectory E:\NewDevEnvi\Assignment3\src\test\resources
[DEBUG] no use filter components
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ Assignment3 ---
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-compiler-plugin:3.1, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile' with basic configurator -->
[DEBUG]   (f) basedir = E:\NewDevEnvi\Assignment3
[DEBUG]   (f) buildDirectory = E:\NewDevEnvi\Assignment3\target
[DEBUG]   (f) classpathElements = [E:\NewDevEnvi\Assignment3\target\test-classes, E:\NewDevEnvi\Assignment3\target\classes, C:\Users\madhukar sadula\.m2\repository\junit\junit\3.8.1\junit-3.8.1.jar, C:\Users\madhukar sadula\.m2\repository\org\apache\derby\derby\10.14.2.0\derby-10.14.2.0.jar]
[DEBUG]   (f) compileSourceRoots = [E:\NewDevEnvi\Assignment3\src\test\java]
[DEBUG]   (f) compilerId = javac
[DEBUG]   (f) debug = true
[DEBUG]   (f) encoding = UTF-8
[DEBUG]   (f) failOnError = true
[DEBUG]   (f) forceJavacCompilerUse = false
[DEBUG]   (f) fork = false
[DEBUG]   (f) generatedTestSourcesDirectory = E:\NewDevEnvi\Assignment3\target\generated-test-sources\test-annotations
[DEBUG]   (f) mojoExecution = org.apache.maven.plugins:maven-compiler-plugin:3.1:testCompile {execution: default-testCompile}
[DEBUG]   (f) optimize = false
[DEBUG]   (f) outputDirectory = E:\NewDevEnvi\Assignment3\target\test-classes
[DEBUG]   (f) showDeprecation = false
[DEBUG]   (f) showWarnings = false
[DEBUG]   (f) skipMultiThreadWarning = false
[DEBUG]   (f) source = 1.5
[DEBUG]   (f) staleMillis = 0
[DEBUG]   (f) target = 1.5
[DEBUG]   (f) useIncrementalCompilation = true
[DEBUG]   (f) verbose = false
[DEBUG]   (f) mavenSession = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG] -- end configuration --
[DEBUG] Using compiler 'javac'.
[DEBUG] Source directories: [E:\NewDevEnvi\Assignment3\src\test\java]
[DEBUG] Classpath: [E:\NewDevEnvi\Assignment3\target\test-classes
 E:\NewDevEnvi\Assignment3\target\classes
 C:\Users\madhukar sadula\.m2\repository\junit\junit\3.8.1\junit-3.8.1.jar
 C:\Users\madhukar sadula\.m2\repository\org\apache\derby\derby\10.14.2.0\derby-10.14.2.0.jar]
[DEBUG] Output directory: E:\NewDevEnvi\Assignment3\target\test-classes
[DEBUG] CompilerReuseStrategy: reuseCreated
[DEBUG] useIncrementalCompilation enabled
[INFO] Changes detected - recompiling the module!
[DEBUG] Classpath:
[DEBUG]  E:\NewDevEnvi\Assignment3\target\test-classes
[DEBUG]  E:\NewDevEnvi\Assignment3\target\classes
[DEBUG]  C:\Users\madhukar sadula\.m2\repository\junit\junit\3.8.1\junit-3.8.1.jar
[DEBUG]  C:\Users\madhukar sadula\.m2\repository\org\apache\derby\derby\10.14.2.0\derby-10.14.2.0.jar
[DEBUG] Source roots:
[DEBUG]  E:\NewDevEnvi\Assignment3\src\test\java
[DEBUG] Command line options:
[DEBUG] -d E:\NewDevEnvi\Assignment3\target\test-classes -classpath E:\NewDevEnvi\Assignment3\target\test-classes;E:\NewDevEnvi\Assignment3\target\classes;C:\Users\madhukar sadula\.m2\repository\junit\junit\3.8.1\junit-3.8.1.jar;C:\Users\madhukar sadula\.m2\repository\org\apache\derby\derby\10.14.2.0\derby-10.14.2.0.jar; -sourcepath E:\NewDevEnvi\Assignment3\src\test\java; -g -nowarn -target 1.5 -source 1.5 -encoding UTF-8
[DEBUG] incrementalBuildHelper#beforeRebuildExecution
[INFO] Compiling 1 source file to E:\NewDevEnvi\Assignment3\target\test-classes
[DEBUG] incrementalBuildHelper#afterRebuildExecution
[INFO] 
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ Assignment3 ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=0, ConflictMarker.markTime=0, ConflictMarker.nodeCount=132, ConflictIdSorter.graphTime=0, ConflictIdSorter.topsortTime=0, ConflictIdSorter.conflictIdCount=27, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=0, ConflictResolver.conflictItemCount=77, DefaultDependencyCollector.collectTime=331, DefaultDependencyCollector.transformTime=0}
[DEBUG] org.apache.maven.plugins:maven-surefire-plugin:jar:2.12.4:
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.0.9:compile
[DEBUG]    org.apache.maven.surefire:surefire-booter:jar:2.12.4:compile
[DEBUG]       org.apache.maven.surefire:surefire-api:jar:2.12.4:compile
[DEBUG]    org.apache.maven.surefire:maven-surefire-common:jar:2.12.4:compile
[DEBUG]       org.apache.commons:commons-lang3:jar:3.1:compile
[DEBUG]       org.apache.maven.shared:maven-common-artifact-filters:jar:1.3:compile
[DEBUG]    org.codehaus.plexus:plexus-utils:jar:3.0.8:compile
[DEBUG]    org.apache.maven:maven-artifact:jar:2.0.9:compile
[DEBUG]    org.apache.maven:maven-project:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-settings:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-profile:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-model:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-artifact-manager:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-plugin-registry:jar:2.0.9:compile
[DEBUG]       org.codehaus.plexus:plexus-container-default:jar:1.0-alpha-9-stable-1:compile
[DEBUG]          junit:junit:jar:3.8.1:test
[DEBUG]    org.apache.maven:maven-core:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-plugin-parameter-documenter:jar:2.0.9:compile
[DEBUG]       org.apache.maven.reporting:maven-reporting-api:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-repository-metadata:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-error-diagnostics:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-plugin-descriptor:jar:2.0.9:compile
[DEBUG]       org.apache.maven:maven-monitor:jar:2.0.9:compile
[DEBUG]       classworlds:classworlds:jar:1.1:compile
[DEBUG]    org.apache.maven:maven-toolchain:jar:2.0.9:compile
[DEBUG]    org.apache.maven.plugin-tools:maven-plugin-annotations:jar:3.1:compile
[DEBUG] Created new class realm plugin>org.apache.maven.plugins:maven-surefire-plugin:2.12.4
[DEBUG] Importing foreign packages into class realm plugin>org.apache.maven.plugins:maven-surefire-plugin:2.12.4
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.apache.maven.plugins:maven-surefire-plugin:2.12.4
[DEBUG]   Included: org.apache.maven.plugins:maven-surefire-plugin:jar:2.12.4
[DEBUG]   Included: org.apache.maven.surefire:surefire-booter:jar:2.12.4
[DEBUG]   Included: org.apache.maven.surefire:surefire-api:jar:2.12.4
[DEBUG]   Included: org.apache.maven.surefire:maven-surefire-common:jar:2.12.4
[DEBUG]   Included: org.apache.commons:commons-lang3:jar:3.1
[DEBUG]   Included: org.apache.maven.shared:maven-common-artifact-filters:jar:1.3
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:3.0.8
[DEBUG]   Included: org.apache.maven.reporting:maven-reporting-api:jar:2.0.9
[DEBUG]   Included: org.apache.maven.plugin-tools:maven-plugin-annotations:jar:3.1
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-surefire-plugin:2.12.4, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test' with basic configurator -->
[DEBUG]   (s) basedir = E:\NewDevEnvi\Assignment3
[DEBUG]   (s) childDelegation = false
[DEBUG]   (s) classesDirectory = E:\NewDevEnvi\Assignment3\target\classes
[DEBUG]   (s) disableXmlReport = false
[DEBUG]   (s) enableAssertions = true
[DEBUG]   (s) forkMode = once
[DEBUG]   (s) junitArtifactName = junit:junit
[DEBUG]   (s) localRepository =       id: local
      url: file:///C:/Users/madhukar%20sadula/.m2/repository/
   layout: default
snapshots: [enabled => true, update => always]
 releases: [enabled => true, update => always]

[DEBUG]   (f) parallelMavenExecution = false
[DEBUG]   (s) perCoreThreadCount = true
[DEBUG]   (s) pluginArtifactMap = {org.apache.maven.plugins:maven-surefire-plugin=org.apache.maven.plugins:maven-surefire-plugin:maven-plugin:2.12.4:, org.apache.maven:maven-plugin-api=org.apache.maven:maven-plugin-api:jar:2.0.9:compile, org.apache.maven.surefire:surefire-booter=org.apache.maven.surefire:surefire-booter:jar:2.12.4:compile, org.apache.maven.surefire:surefire-api=org.apache.maven.surefire:surefire-api:jar:2.12.4:compile, org.apache.maven.surefire:maven-surefire-common=org.apache.maven.surefire:maven-surefire-common:jar:2.12.4:compile, org.apache.commons:commons-lang3=org.apache.commons:commons-lang3:jar:3.1:compile, org.apache.maven.shared:maven-common-artifact-filters=org.apache.maven.shared:maven-common-artifact-filters:jar:1.3:compile, org.codehaus.plexus:plexus-utils=org.codehaus.plexus:plexus-utils:jar:3.0.8:compile, org.apache.maven:maven-artifact=org.apache.maven:maven-artifact:jar:2.0.9:compile, org.apache.maven:maven-project=org.apache.maven:maven-project:jar:2.0.9:compile, org.apache.maven:maven-settings=org.apache.maven:maven-settings:jar:2.0.9:compile, org.apache.maven:maven-profile=org.apache.maven:maven-profile:jar:2.0.9:compile, org.apache.maven:maven-model=org.apache.maven:maven-model:jar:2.0.9:compile, org.apache.maven:maven-artifact-manager=org.apache.maven:maven-artifact-manager:jar:2.0.9:compile, org.apache.maven:maven-plugin-registry=org.apache.maven:maven-plugin-registry:jar:2.0.9:compile, org.codehaus.plexus:plexus-container-default=org.codehaus.plexus:plexus-container-default:jar:1.0-alpha-9-stable-1:compile, org.apache.maven:maven-core=org.apache.maven:maven-core:jar:2.0.9:compile, org.apache.maven:maven-plugin-parameter-documenter=org.apache.maven:maven-plugin-parameter-documenter:jar:2.0.9:compile, org.apache.maven.reporting:maven-reporting-api=org.apache.maven.reporting:maven-reporting-api:jar:2.0.9:compile, org.apache.maven:maven-repository-metadata=org.apache.maven:maven-repository-metadata:jar:2.0.9:compile, org.apache.maven:maven-error-diagnostics=org.apache.maven:maven-error-diagnostics:jar:2.0.9:compile, org.apache.maven:maven-plugin-descriptor=org.apache.maven:maven-plugin-descriptor:jar:2.0.9:compile, org.apache.maven:maven-monitor=org.apache.maven:maven-monitor:jar:2.0.9:compile, classworlds:classworlds=classworlds:classworlds:jar:1.1:compile, org.apache.maven:maven-toolchain=org.apache.maven:maven-toolchain:jar:2.0.9:compile, org.apache.maven.plugin-tools:maven-plugin-annotations=org.apache.maven.plugin-tools:maven-plugin-annotations:jar:3.1:compile}
[DEBUG]   (f) pluginDescriptor = Component Descriptor: role: 'org.apache.maven.plugin.Mojo', implementation: 'org.apache.maven.plugin.surefire.HelpMojo', role hint: 'org.apache.maven.plugins:maven-surefire-plugin:2.12.4:help'
role: 'org.apache.maven.plugin.Mojo', implementation: 'org.apache.maven.plugin.surefire.SurefirePlugin', role hint: 'org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test'
---
[DEBUG]   (s) printSummary = true
[DEBUG]   (s) projectArtifactMap = {junit:junit=junit:junit:jar:3.8.1:test, org.apache.derby:derby=org.apache.derby:derby:jar:10.14.2.0:test}
[DEBUG]   (s) redirectTestOutputToFile = false
[DEBUG]   (s) remoteRepositories = [      id: central
      url: https://repo.maven.apache.org/maven2
   layout: default
snapshots: [enabled => false, update => daily]
 releases: [enabled => true, update => never]
]
[DEBUG]   (s) reportFormat = brief
[DEBUG]   (s) reportsDirectory = E:\NewDevEnvi\Assignment3\target\surefire-reports
[DEBUG]   (s) runOrder = filesystem
[DEBUG]   (s) skip = false
[DEBUG]   (s) skipTests = false
[DEBUG]   (s) testClassesDirectory = E:\NewDevEnvi\Assignment3\target\test-classes
[DEBUG]   (s) testFailureIgnore = false
[DEBUG]   (s) testNGArtifactName = org.testng:testng
[DEBUG]   (s) testSourceDirectory = E:\NewDevEnvi\Assignment3\src\test\java
[DEBUG]   (s) trimStackTrace = true
[DEBUG]   (s) useFile = true
[DEBUG]   (s) useManifestOnlyJar = true
[DEBUG]   (s) useSystemClassLoader = true
[DEBUG]   (s) useUnlimitedThreads = false
[DEBUG]   (s) workingDirectory = E:\NewDevEnvi\Assignment3
[DEBUG]   (s) project = MavenProject: com.wipro.topgear:Assignment3:0.0.1-SNAPSHOT @ E:\NewDevEnvi\Assignment3\pom.xml
[DEBUG]   (s) session = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG] -- end configuration --
[INFO] Surefire report directory: E:\NewDevEnvi\Assignment3\target\surefire-reports
[DEBUG] Setting system property [user.dir]=[E:\NewDevEnvi\Assignment3]
[DEBUG] Setting system property [localRepository]=[C:\Users\madhukar sadula\.m2\repository]
[DEBUG] Setting system property [basedir]=[E:\NewDevEnvi\Assignment3]
[DEBUG] dummy:dummy:jar:1.0 (selected for null)
[DEBUG]   org.apache.maven.surefire:surefire-booter:jar:2.12.4:compile (selected for compile)
[DEBUG]     org.apache.maven.surefire:surefire-api:jar:2.12.4:compile (selected for compile)
[DEBUG] Adding to surefire booter test classpath: C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-booter\2.12.4\surefire-booter-2.12.4.jar Scope: compile
[DEBUG] Adding to surefire booter test classpath: C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-api\2.12.4\surefire-api-2.12.4.jar Scope: compile
[DEBUG] Using JVM: C:\Program Files\Java\jdk1.8.0_121\jre\bin\java
[DEBUG] dummy:dummy:jar:1.0 (selected for null)
[DEBUG] Using connector AetherRepositoryConnector with priority 3.4028235E38 for https://repo.maven.apache.org/maven2
[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit3/2.12.4/surefire-junit3-2.12.4.pom
[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit3/2.12.4/surefire-junit3-2.12.4.pom (2 KB at 0.8 KB/sec)
[DEBUG] Writing tracking file C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-junit3\2.12.4\_remote.repositories
[DEBUG] Writing tracking file C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-junit3\2.12.4\surefire-junit3-2.12.4.pom.lastUpdated
[DEBUG] Using connector AetherRepositoryConnector with priority 3.4028235E38 for https://repo.maven.apache.org/maven2
[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom
[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-providers/2.12.4/surefire-providers-2.12.4.pom (3 KB at 7.3 KB/sec)
[DEBUG] Writing tracking file C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-providers\2.12.4\_remote.repositories
[DEBUG] Writing tracking file C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-providers\2.12.4\surefire-providers-2.12.4.pom.lastUpdated
[DEBUG]   org.apache.maven.surefire:surefire-junit3:jar:2.12.4:test (selected for test)
[DEBUG]     org.apache.maven.surefire:surefire-api:jar:2.12.4:test (selected for test)
[DEBUG] Using connector AetherRepositoryConnector with priority 3.4028235E38 for https://repo.maven.apache.org/maven2
[INFO] Downloading: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit3/2.12.4/surefire-junit3-2.12.4.jar
[INFO] Downloaded: https://repo.maven.apache.org/maven2/org/apache/maven/surefire/surefire-junit3/2.12.4/surefire-junit3-2.12.4.jar (26 KB at 50.4 KB/sec)
[DEBUG] Writing tracking file C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-junit3\2.12.4\_remote.repositories
[DEBUG] Writing tracking file C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-junit3\2.12.4\surefire-junit3-2.12.4.jar.lastUpdated
[DEBUG] Adding to surefire test classpath: C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-junit3\2.12.4\surefire-junit3-2.12.4.jar Scope: test
[DEBUG] Adding to surefire test classpath: C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-api\2.12.4\surefire-api-2.12.4.jar Scope: test
[DEBUG] test classpath classpath:
[DEBUG]   E:\NewDevEnvi\Assignment3\target\test-classes
[DEBUG]   E:\NewDevEnvi\Assignment3\target\classes
[DEBUG]   C:\Users\madhukar sadula\.m2\repository\junit\junit\3.8.1\junit-3.8.1.jar
[DEBUG]   C:\Users\madhukar sadula\.m2\repository\org\apache\derby\derby\10.14.2.0\derby-10.14.2.0.jar
[DEBUG] provider classpath classpath:
[DEBUG]   C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-junit3\2.12.4\surefire-junit3-2.12.4.jar
[DEBUG]   C:\Users\madhukar sadula\.m2\repository\org\apache\maven\surefire\surefire-api\2.12.4\surefire-api-2.12.4.jar

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Forking command line: cmd.exe /X /C ""C:\Program Files\Java\jdk1.8.0_121\jre\bin\java" -jar E:\NewDevEnvi\Assignment3\target\surefire\surefirebooter2827630520028780844.jar E:\NewDevEnvi\Assignment3\target\surefire\surefire9044291066873008181tmp E:\NewDevEnvi\Assignment3\target\surefire\surefire_03281551934802952012tmp"
Running com.wipro.topgear.Assignment3.AppTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.011 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] 
[INFO] --- maven-jar-plugin:2.4:jar (default-jar) @ Assignment3 ---
[DEBUG] Dependency collection stats: {ConflictMarker.analyzeTime=0, ConflictMarker.markTime=0, ConflictMarker.nodeCount=74, ConflictIdSorter.graphTime=0, ConflictIdSorter.topsortTime=0, ConflictIdSorter.conflictIdCount=28, ConflictIdSorter.conflictIdCycleCount=0, ConflictResolver.totalTime=0, ConflictResolver.conflictItemCount=70, DefaultDependencyCollector.collectTime=110, DefaultDependencyCollector.transformTime=0}
[DEBUG] org.apache.maven.plugins:maven-jar-plugin:jar:2.4:
[DEBUG]    org.apache.maven:maven-plugin-api:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-project:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-settings:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-profile:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-artifact-manager:jar:2.0.6:compile
[DEBUG]          org.apache.maven:maven-repository-metadata:jar:2.0.6:compile
[DEBUG]       org.apache.maven:maven-plugin-registry:jar:2.0.6:compile
[DEBUG]       org.codehaus.plexus:plexus-container-default:jar:1.0-alpha-9-stable-1:compile
[DEBUG]          junit:junit:jar:3.8.1:compile
[DEBUG]          classworlds:classworlds:jar:1.1-alpha-2:compile
[DEBUG]    org.apache.maven:maven-model:jar:2.0.6:runtime
[DEBUG]    org.apache.maven:maven-artifact:jar:2.0.6:compile
[DEBUG]    org.apache.maven:maven-archiver:jar:2.5:compile
[DEBUG]       org.apache.maven:maven-core:jar:2.0.6:compile
[DEBUG]          org.apache.maven:maven-plugin-parameter-documenter:jar:2.0.6:compile
[DEBUG]          org.apache.maven.reporting:maven-reporting-api:jar:2.0.6:compile
[DEBUG]             org.apache.maven.doxia:doxia-sink-api:jar:1.0-alpha-7:compile
[DEBUG]          org.apache.maven:maven-error-diagnostics:jar:2.0.6:compile
[DEBUG]          commons-cli:commons-cli:jar:1.0:compile
[DEBUG]          org.apache.maven:maven-plugin-descriptor:jar:2.0.6:compile
[DEBUG]          org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4:compile
[DEBUG]          org.apache.maven:maven-monitor:jar:2.0.6:compile
[DEBUG]       org.codehaus.plexus:plexus-interpolation:jar:1.15:compile
[DEBUG]    org.codehaus.plexus:plexus-archiver:jar:2.1:compile
[DEBUG]       org.codehaus.plexus:plexus-io:jar:2.0.2:compile
[DEBUG]    commons-lang:commons-lang:jar:2.1:compile
[DEBUG]    org.codehaus.plexus:plexus-utils:jar:3.0:compile
[DEBUG] Created new class realm plugin>org.apache.maven.plugins:maven-jar-plugin:2.4
[DEBUG] Importing foreign packages into class realm plugin>org.apache.maven.plugins:maven-jar-plugin:2.4
[DEBUG]   Imported:  < maven.api
[DEBUG] Populating class realm plugin>org.apache.maven.plugins:maven-jar-plugin:2.4
[DEBUG]   Included: org.apache.maven.plugins:maven-jar-plugin:jar:2.4
[DEBUG]   Included: junit:junit:jar:3.8.1
[DEBUG]   Included: org.apache.maven:maven-archiver:jar:2.5
[DEBUG]   Included: org.apache.maven.reporting:maven-reporting-api:jar:2.0.6
[DEBUG]   Included: org.apache.maven.doxia:doxia-sink-api:jar:1.0-alpha-7
[DEBUG]   Included: commons-cli:commons-cli:jar:1.0
[DEBUG]   Included: org.codehaus.plexus:plexus-interactivity-api:jar:1.0-alpha-4
[DEBUG]   Included: org.codehaus.plexus:plexus-interpolation:jar:1.15
[DEBUG]   Included: org.codehaus.plexus:plexus-archiver:jar:2.1
[DEBUG]   Included: org.codehaus.plexus:plexus-io:jar:2.0.2
[DEBUG]   Included: commons-lang:commons-lang:jar:2.1
[DEBUG]   Included: org.codehaus.plexus:plexus-utils:jar:3.0
[DEBUG] Configuring mojo org.apache.maven.plugins:maven-jar-plugin:2.4:jar from plugin realm ClassRealm[plugin>org.apache.maven.plugins:maven-jar-plugin:2.4, parent: sun.misc.Launcher$AppClassLoader@55f96302]
[DEBUG] Configuring mojo 'org.apache.maven.plugins:maven-jar-plugin:2.4:jar' with basic configurator -->
[DEBUG]   (f) classesDirectory = E:\NewDevEnvi\Assignment3\target\classes
[DEBUG]   (f) defaultManifestFile = E:\NewDevEnvi\Assignment3\target\classes\META-INF\MANIFEST.MF
[DEBUG]   (f) finalName = Assignment3-0.0.1-SNAPSHOT
[DEBUG]   (f) forceCreation = false
[DEBUG]   (f) outputDirectory = E:\NewDevEnvi\Assignment3\target
[DEBUG]   (f) project = MavenProject: com.wipro.topgear:Assignment3:0.0.1-SNAPSHOT @ E:\NewDevEnvi\Assignment3\pom.xml
[DEBUG]   (f) session = org.apache.maven.execution.MavenSession@119f1f2a
[DEBUG]   (f) skipIfEmpty = false
[DEBUG]   (f) useDefaultManifestFile = false
[DEBUG] -- end configuration --
[DEBUG] isUp2date: false (Destination E:\NewDevEnvi\Assignment3\target\Assignment3-0.0.1-SNAPSHOT.jar not found.)
[INFO] Building jar: E:\NewDevEnvi\Assignment3\target\Assignment3-0.0.1-SNAPSHOT.jar
[DEBUG] adding directory META-INF/
[DEBUG] adding entry META-INF/MANIFEST.MF
[DEBUG] adding directory com/
[DEBUG] adding directory com/wipro/
[DEBUG] adding directory com/wipro/topgear/
[DEBUG] adding directory com/wipro/topgear/Assignment3/
[DEBUG] adding directory META-INF/maven/
[DEBUG] adding directory META-INF/maven/com.wipro.topgear/
[DEBUG] adding directory META-INF/maven/com.wipro.topgear/Assignment3/
[DEBUG] adding entry com/wipro/topgear/Assignment3/App.class
[DEBUG] adding entry META-INF/maven/com.wipro.topgear/Assignment3/pom.properties
[DEBUG] adding entry META-INF/maven/com.wipro.topgear/Assignment3/pom.xml
[DEBUG] adding entry META-INF/maven/com.wipro.topgear/Assignment3/pom.xml
[DEBUG] adding entry META-INF/maven/com.wipro.topgear/Assignment3/pom.properties
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 13.132 s
[INFO] Finished at: 2018-09-27T18:46:28+05:30
[INFO] Final Memory: 17M/135M
[INFO] ------------------------------------------------------------------------
