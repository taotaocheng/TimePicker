##基于WheelView 的 TimePicker滚轮控件

###（简述）: 
根据 Wheelview 的TimePicker 实现滚轮效果。
![TimePicker](https://github.com/chenxiruanhai/TimePicker/time_picker.jpg)

# Attributes

There are several attributes you can set:


| attr 属性          | description 描述 |
|:---				 |:---|
| lineColor  	     | divider line color 分割线颜色 |
| bottomLineColor    | bottom line color 分割线颜色 |
| firstLineAndSecondLineSpace    | firstLine And SecondLineS pace  底部和上部分割线距离 |
| lineHeight  	     | divider line height 分割线高度 |
| itemNumber	 	 | wheelview show item count 此wheelView显示item的个数 |
| maskHight 		 | mask height 蒙版高度（normalText的位置） |
| noEmpty 			 | if set true select area can't be null(empty),or could be empty 设置true则选中不能为空，否则可以是空 |
| normalTextColor 	 | unSelected Text color 未选中文本颜色 |
| normalTextSize 	 | unSelected Text size 未选中文本字体大小 |
| selectedTextColor | selected Text color 选中文本颜色 |
| selectedTextSize 	 | selected Text size 选中文本字体大小 |
| unitHight 		 | item unit height 每个item单元的高度 |

#Method
###1. setData(ArrayList<String> data)
set WheelView data</br> 
设置WheelView的数据

###2. resetData(ArrayList<String> data) 
**reset** WheelView data ,if you has setData</br>
**重置** WheelView的数据，如果已经设置过的话

###3. int getSelected()
get selected item index</br>
获取选中项的index

###4. String getSelectedText()
get selected item text</br>
获取选中项的文本信息

###5. boolean isScrolling
is WheelView is scrolling</br>
获取WheelView是否在滚动中

###6. boolean isEnable()
is WheelView is enable</br>
获取wheelView是否可用

###7. void setEnable(boolean isEnable)  
set WheelView enable</br>
设置WheelView是否可用

###8. void setDefault(int index)
set **default selected index**</br>
设置**默认选中项的index**
 
###9. int getListSize() 
get WheelView item count</br>
获取WheelView的item项个数

###10. String getItemText(int index)
get the text by index </br>
获取index位置上的文本数据

###11. void setOnSelectListener(OnSelectListener onSelectListener)
set listener on WheelView that can get info when WheelView is **scrolling** or **stop scroll**.</br>
对WheelView**设置监听**，在 **滑动过程** 或者 **滑动停止** 返回数据信息。
