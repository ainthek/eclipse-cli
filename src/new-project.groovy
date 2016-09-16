// TODO: better way to read params ?
PROJECT_NAME=System.getenv()['PROJECT_NAME'];
//
bundle = org.eclipse.core.runtime.Platform.getBundle("org.eclipse.core.resources"); 
resPlugin = bundle.loadClass("org.eclipse.core.resources.ResourcesPlugin"); 
root = resPlugin.getWorkspace().getRoot(); 
project = root.getProject(PROJECT_NAME); 
project.create(null); 
project.open(null); 
resPlugin.getWorkspace().save(true, null);