package faang.school.accountservice.mapper;

import faang.school.accountservice.dto.BalanceDto;
import faang.school.accountservice.model.Account;
import faang.school.accountservice.model.Balance;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-28T12:43:37+0700",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class BalanceMapperImpl implements BalanceMapper {

    @Override
    public BalanceDto toDto(Balance balance) {
        if ( balance == null ) {
            return null;
        }

        BalanceDto.BalanceDtoBuilder balanceDto = BalanceDto.builder();

        balanceDto.accountId( balanceAccountId( balance ) );
        balanceDto.id( balance.getId() );
        balanceDto.authorizationBalance( balance.getAuthorizationBalance() );
        balanceDto.currentBalance( balance.getCurrentBalance() );
        balanceDto.createdAt( balance.getCreatedAt() );
        balanceDto.updatedAt( balance.getUpdatedAt() );

        return balanceDto.build();
    }

    @Override
    public Balance toEntity(BalanceDto balanceDto) {
        if ( balanceDto == null ) {
            return null;
        }

        Balance.BalanceBuilder balance = Balance.builder();

        balance.id( balanceDto.getId() );
        balance.authorizationBalance( balanceDto.getAuthorizationBalance() );
        balance.currentBalance( balanceDto.getCurrentBalance() );
        balance.createdAt( balanceDto.getCreatedAt() );
        balance.updatedAt( balanceDto.getUpdatedAt() );

        return balance.build();
    }

    private Long balanceAccountId(Balance balance) {
        if ( balance == null ) {
            return null;
        }
        Account account = balance.getAccount();
        if ( account == null ) {
            return null;
        }
        Long id = account.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
