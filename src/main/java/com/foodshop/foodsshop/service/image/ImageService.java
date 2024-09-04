package com.foodshop.foodsshop.service.image;

import com.foodshop.foodsshop.model.Image;
import com.foodshop.foodsshop.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class ImageService implements IImageService {
    private ImageRepository imageRepository;
    @Override
    public Image getImageById(Long id) {
        return null;
    }

    @Override
    public void deleteImageById(Long id) {

    }

    @Override
    public Image saveImage(MultipartFile file, Long productId) {
        return null;
    }

    @Override
    public Image updateImage(MultipartFile file, Long imageId) {
        return null;
    }
}
