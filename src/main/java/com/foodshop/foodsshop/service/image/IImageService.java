package com.foodshop.foodsshop.service.image;

import com.foodshop.foodsshop.model.Image;
import org.springframework.web.multipart.MultipartFile;

public interface IImageService {
    Image getImageById(Long id);
    void deleteImageById(Long id);
    Image saveImage(MultipartFile file, Long productId);
    Image updateImage(MultipartFile file, Long imageId);
}
