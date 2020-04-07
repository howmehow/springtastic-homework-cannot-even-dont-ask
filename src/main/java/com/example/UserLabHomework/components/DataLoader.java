package com.example.UserLabHomework.components;

import com.example.UserLabHomework.models.File;
import com.example.UserLabHomework.models.Folder;
import com.example.UserLabHomework.models.User;
import com.example.UserLabHomework.repositories.FileRepository;
import com.example.UserLabHomework.repositories.FolderRepository;
import com.example.UserLabHomework.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) {

        User user1 = new User("Michael");
        userRepository.save(user1);
        Folder folder1 = new Folder("folder1", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("folder1", user1);
        folderRepository.save(folder2);

        File notebook = new File("notebook", "txt", 10, folder1);
        fileRepository.save(notebook);
        File notebook2 = new File("notebook", "txt", 10, folder1);
        fileRepository.save(notebook2);
        File notebook3 = new File("notebook", "txt", 10, folder1);
        fileRepository.save(notebook3);
        File notebook4 = new File("notebook", "txt", 10, folder1);
        fileRepository.save(notebook4);
        File notebook01 = new File("notebook", "txt", 10, folder2);
        fileRepository.save(notebook01);



    }
}
