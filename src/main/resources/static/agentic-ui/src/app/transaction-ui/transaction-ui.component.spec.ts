import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TransactionUiComponent } from './transaction-ui.component';

describe('TransactionUiComponent', () => {
  let component: TransactionUiComponent;
  let fixture: ComponentFixture<TransactionUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TransactionUiComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TransactionUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
