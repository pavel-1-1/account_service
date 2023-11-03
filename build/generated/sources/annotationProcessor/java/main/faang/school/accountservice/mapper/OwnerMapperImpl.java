package faang.school.accountservice.mapper;

import faang.school.accountservice.dto.OwnerDto;
import faang.school.accountservice.model.Owner;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-13T18:21:12+0700",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class OwnerMapperImpl implements OwnerMapper {

    @Override
    public Owner createDtoToEntity(OwnerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Owner.OwnerBuilder owner = Owner.builder();

        owner.ownerId( dto.getOwnerId() );
        owner.type( dto.getType() );

        return owner.build();
    }

    @Override
    public OwnerDto entityToResponseDto(Owner entity) {
        if ( entity == null ) {
            return null;
        }

        OwnerDto.OwnerDtoBuilder ownerDto = OwnerDto.builder();

        ownerDto.ownerId( entity.getOwnerId() );
        ownerDto.type( entity.getType() );

        return ownerDto.build();
    }
}
