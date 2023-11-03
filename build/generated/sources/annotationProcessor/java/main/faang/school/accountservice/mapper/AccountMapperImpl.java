package faang.school.accountservice.mapper;

import faang.school.accountservice.dto.account.CreateAccountDto;
import faang.school.accountservice.dto.account.ResponseAccountDto;
import faang.school.accountservice.model.Account;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-28T12:43:37+0700",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Autowired
    private OwnerMapper ownerMapper;

    @Override
    public Account createDtoToEntity(CreateAccountDto dto) {
        if ( dto == null ) {
            return null;
        }

        Account.AccountBuilder account = Account.builder();

        account.number( dto.getNumber() );
        account.owner( ownerMapper.createDtoToEntity( dto.getOwner() ) );
        account.type( dto.getType() );
        account.currency( dto.getCurrency() );

        return account.build();
    }

    @Override
    public ResponseAccountDto entityToResponseDto(Account entity) {
        if ( entity == null ) {
            return null;
        }

        ResponseAccountDto.ResponseAccountDtoBuilder responseAccountDto = ResponseAccountDto.builder();

        responseAccountDto.id( entity.getId() );
        responseAccountDto.number( entity.getNumber() );
        responseAccountDto.owner( ownerMapper.entityToResponseDto( entity.getOwner() ) );
        responseAccountDto.type( entity.getType() );
        responseAccountDto.currency( entity.getCurrency() );
        responseAccountDto.status( entity.getStatus() );
        responseAccountDto.createdAt( entity.getCreatedAt() );
        responseAccountDto.updatedAt( entity.getUpdatedAt() );
        responseAccountDto.closedAt( entity.getClosedAt() );

        return responseAccountDto.build();
    }
}
