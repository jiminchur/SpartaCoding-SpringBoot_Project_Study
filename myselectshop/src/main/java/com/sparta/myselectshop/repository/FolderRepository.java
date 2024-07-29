package com.sparta.myselectshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.User;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUser(User user);
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
}
