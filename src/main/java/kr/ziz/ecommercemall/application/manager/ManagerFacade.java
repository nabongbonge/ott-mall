package kr.ziz.ecommercemall.application.manager;

import kr.ziz.ecommercemall.domain.manager.*;
import kr.ziz.ecommercemall.interfaces.manager.ManagerDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManagerFacade {

  private final ManagerService managerService;

  public ManagerInfo registerManager(ManagerCommand command) {
    return managerService.registerManager(command);
  }

  public ManagerInfo updateManagerForPassword(ManagerDto.ChangePasswordRequest request) {
    return managerService.changePassword(request);
  }

  public ManagerInfo updateManagerForInfo(ManagerDto.ChangeInfoRequest request) {
    return managerService.changeInfo(request);
  }

  public void deleteManager(ManagerDto.WithdrawalRequest request) {
    managerService.deleteManager(request);
  }
}
