public List<File> getAllFiles(File rootDir) {
      File[] children = rootDir.listFiles();
      if (children == null || children.length == 0) {
          return Collections.emptyList();
      }

      List<File> files = new ArrayList<>();
      for (File child : children) {
          if (child.isDirecotory()) {
             files.addAll(getAllFiles(child));
         } else {
             files.add(child);
         }
     }

     return files;
 }
