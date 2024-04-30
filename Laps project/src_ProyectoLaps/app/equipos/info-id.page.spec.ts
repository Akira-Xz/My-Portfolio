import { ComponentFixture, TestBed } from '@angular/core/testing';
import { InfoIdPage } from './info-id.page';

describe('InfoIdPage', () => {
  let component: InfoIdPage;
  let fixture: ComponentFixture<InfoIdPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(InfoIdPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
