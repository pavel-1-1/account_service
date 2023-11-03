package faang.school.accountservice.mapper;

import faang.school.accountservice.dto.OpenSavingsScoreDto;
import faang.school.accountservice.model.SavingsAccount;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-01T15:56:42+0700",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.6.1.jar, environment: Java 17.0.8 (Amazon.com Inc.)"
)
@Component
public class OpenSavingsScoreMapperImpl implements OpenSavingsScoreMapper {

    @Override
    public OpenSavingsScoreDto toOpenSavingsScoreDto(SavingsAccount savingsAccount) {
        if ( savingsAccount == null ) {
            return null;
        }

        OpenSavingsScoreDto.OpenSavingsScoreDtoBuilder openSavingsScoreDto = OpenSavingsScoreDto.builder();

        openSavingsScoreDto.number( savingsAccount.getNumber() );
        openSavingsScoreDto.tariffHistory( savingsAccount.getTariffHistory() );
        openSavingsScoreDto.amount( savingsAccount.getAmount() );

        return openSavingsScoreDto.build();
    }
}
