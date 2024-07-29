package com.sparta.myselectshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.entity.ProductFolder;

import java.util.Optional;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long>{

    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);

}