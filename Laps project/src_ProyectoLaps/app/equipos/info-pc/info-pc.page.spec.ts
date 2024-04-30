import { ComponentFixture, TestBed } from '@angular/core/testing';
import { InfoPcPage } from './info-pc.page';

describe('InfoPcPage', () => {
  let component: InfoPcPage;
  let fixture: ComponentFixture<InfoPcPage>;

  beforeEach(async(() => {
    fixture = TestBed.createComponent(InfoPcPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
