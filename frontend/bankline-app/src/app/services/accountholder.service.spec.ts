import { TestBed } from '@angular/core/testing';

import { AccountholderService } from './accountholder.service';

describe('AccountholderService', () => {
  let service: AccountholderService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(AccountholderService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
