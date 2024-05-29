package system;

public interface FileManager {
    void openFile(String path);

    void closeFile(String path);

    void readFromFile(String path);

    void writeToFile(String path, String content);

    void deleteFile(String path);

    void copyFile(String sourcePath, String destinationPath);

    void moveFile(String sourcePath, String destinationPath);

    void renameFile(String path, String newName);

    void findFile(String path, String name);
}
