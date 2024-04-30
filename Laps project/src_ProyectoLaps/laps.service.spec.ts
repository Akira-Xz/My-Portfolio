import { TestBed } from '@angular/core/testing';

import { LapsService } from './laps.service';

describe('LapsService', () => {
  let service: LapsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(LapsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
