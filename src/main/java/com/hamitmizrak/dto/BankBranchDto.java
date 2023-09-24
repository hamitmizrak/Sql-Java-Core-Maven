package com.hamitmizrak.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor
@Builder
public class BankBranchDto  extends CommonProperty implements Serializable {
    public static final Long serialVersionUID=1L;

    private String branchBankName;

    public BankBranchDto(String branchBankName) {
        this.branchBankName = branchBankName;
    }

    @Override
    public String toString() {
        return "BankBranchDto{" +
                "branchBankName='" + branchBankName + '\'' +
                ", id=" + id +
                ", createdDate=" + createdDate +
                "} " + super.toString();
    }
}
