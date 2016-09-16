# eclipse-cli

## Setup

	# tested on windows 10 + Git 2.0 bash console
	# needs path to eclipse
	export ECLIPSE_BIN="/C/PF/sts-bundle/sts-3.7.3.RELEASE/eclipsec.exe"
	
	# install 
	npm install -g 'git+https://github.com/ainthek/eclipse-cli.git'
	
	# use
	mkdir test
	cd test
	eclipse-cli-new-project project1

	# creates .metadata and project1 folders
	ls -la

	# open in eclipse
	$ECLIPSE_BIN -data . &

	# cleanup
	rm -rf test


## Idea

set params; exec groovy as ANT build

	PROJECT_NAME="test" ./bin/eclipse-cli ./src/new-project.groovy

## References 

- <http://stackoverflow.com/questions/8908219/eclipse-import-project-using-command-line>
- <http://groovy.jmiguel.eu/groovy.codehaus.org/The+groovy+Ant+Task.html>
- <http://help.eclipse.org/mars/index.jsp?topic=%2Forg.eclipse.pde.doc.user%2Ftasks%2Fpde_product_build.htm>