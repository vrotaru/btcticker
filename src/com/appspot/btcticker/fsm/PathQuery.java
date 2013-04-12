
// line 1 "PathQuery.ragel"
// Generated using:
// ragel -J -o src/com/appspot/btcticker/fsm/PathQuery.java PathQuery.ragel
//
package com.appspot.btcticker.fsm;

import com.appspot.btcticker.enums.Currency;
import com.appspot.btcticker.enums.Rate;

public class PathQuery {

	public Currency from = Currency.BITCOIN;
	public Currency to   = Currency.DOLLAR;
	public Rate rate = Rate.TICKER;
	public double amount = -9;


// line 20 "src/com/appspot/btcticker/fsm/PathQuery.java"
private static byte[] init__query_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    2,    1,    3,    1,    4,    1,    5,    1,
	    6,    1,    7,    1,    8,    1,    9,    1,   10,    1,   15,    1,
	   17,    1,   18,    2,    0,    1,    2,   15,   11,    2,   15,   12,
	    2,   15,   13,    2,   15,   14,    3,   16,    0,    1
	};
}

private static final byte _query_actions[] = init__query_actions_0();


private static byte[] init__query_key_offsets_0()
{
	return new byte [] {
	    0,    0,    1,    5,    8,    9,   10,   11,   12,   13,   17,   18,
	   19,   20,   21,   22,   23,   24,   25,   26,   27,   28,   29,   30,
	   31,   32,   33,   34,   35,   36,   38,   41,   42,   43,   47,   48,
	   49,   50,   52,   55,   63,   71,   71,   73,   74,   76,   80,   84,
	   86,   90
	};
}

private static final byte _query_key_offsets[] = init__query_key_offsets_0();


private static char[] init__query_trans_keys_0()
{
	return new char [] {
	   47,   98,  115,   48,   57,  112,   48,   57,  112,  110,  103,  116,
	   99,  100,  101,  103,  117,  107,  107,  117,  114,   98,  112,  115,
	  100,  117,  114,   98,  116,   99,   98,  112,  115,  100,  117,  121,
	   48,   57,  112,   48,   57,  116,   99,  100,  101,  103,  117,  101,
	  108,  108,   48,   57,  112,   48,   57,   46,   98,  100,  101,  103,
	  117,   48,   57,   46,   98,  100,  101,  103,  117,   48,   57,   46,
	   50,   46,   46,   50,   46,   98,   48,   57,   46,   98,   48,   57,
	   46,   52,   46,   98,   48,   57,   46,   98,   48,   57,    0
	};
}

private static final char _query_trans_keys[] = init__query_trans_keys_0();


private static byte[] init__query_single_lengths_0()
{
	return new byte [] {
	    0,    1,    2,    1,    1,    1,    1,    1,    1,    4,    1,    1,
	    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,    1,
	    1,    1,    1,    1,    1,    0,    1,    1,    1,    4,    1,    1,
	    1,    0,    1,    6,    6,    0,    2,    1,    2,    2,    2,    2,
	    2,    2
	};
}

private static final byte _query_single_lengths[] = init__query_single_lengths_0();


private static byte[] init__query_range_lengths_0()
{
	return new byte [] {
	    0,    0,    1,    1,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    1,    1,    0,    0,    0,    0,    0,
	    0,    1,    1,    1,    1,    0,    0,    0,    0,    1,    1,    0,
	    1,    1
	};
}

private static final byte _query_range_lengths[] = init__query_range_lengths_0();


private static short[] init__query_index_offsets_0()
{
	return new short [] {
	    0,    0,    2,    6,    9,   11,   13,   15,   17,   19,   24,   26,
	   28,   30,   32,   34,   36,   38,   40,   42,   44,   46,   48,   50,
	   52,   54,   56,   58,   60,   62,   64,   67,   69,   71,   76,   78,
	   80,   82,   84,   87,   95,  103,  104,  107,  109,  112,  116,  120,
	  123,  127
	};
}

private static final short _query_index_offsets[] = init__query_index_offsets_0();


private static byte[] init__query_indicies_0()
{
	return new byte [] {
	    0,    1,    3,    4,    2,    1,    6,    5,    1,    6,    1,    7,
	    1,    8,    1,    9,    1,   10,    1,   11,   12,   13,   14,    1,
	   15,    1,   16,    1,   17,    1,   16,    1,   18,    1,   16,    1,
	   19,    1,   16,    1,   20,    1,   21,    1,   22,    1,   23,    1,
	   16,    1,   24,    1,   21,    1,   25,    1,   21,    1,   26,    1,
	   27,    1,   28,    1,    6,   29,    1,   30,    1,   31,    1,   32,
	   33,   34,   35,    1,   36,    1,   37,    1,   38,    1,   39,    1,
	    6,   40,    1,   41,   43,   44,   45,   46,   47,   42,    1,   48,
	   43,   44,   45,   46,   47,    5,    1,    1,   49,   50,    1,   49,
	    1,   49,   51,    1,   52,   54,   53,    1,   55,   54,   29,    1,
	   49,   56,    1,   57,   59,   58,    1,   60,   59,   40,    1,    0
	};
}

private static final byte _query_indicies[] = init__query_indicies_0();


private static byte[] init__query_trans_targs_0()
{
	return new byte [] {
	    2,    0,   39,   27,   34,   40,    5,    6,   41,    8,   42,   10,
	   12,   14,   16,   11,   43,   13,   15,   17,   19,   44,   21,   22,
	   24,   26,   28,   29,   45,   46,   32,   47,   10,   12,   14,   16,
	   35,   36,   37,   48,   49,    3,   39,    7,   10,   18,   23,   25,
	    4,    4,    9,   20,   30,   45,   31,    4,   33,   38,   48,   31,
	    4
	};
}

private static final byte _query_trans_targs[] = init__query_trans_targs_0();


private static byte[] init__query_trans_actions_0()
{
	return new byte [] {
	    0,    0,   27,    0,    0,    3,    0,    0,    0,    0,    0,   11,
	    7,    9,    5,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,   42,    3,    0,    0,   19,   15,   17,   13,
	    0,    0,    0,   27,    3,   21,    1,   21,   39,   33,   36,   30,
	   21,    0,    0,    0,   23,    1,   23,   23,    0,   25,    1,   25,
	   25
	};
}

private static final byte _query_trans_actions[] = init__query_trans_actions_0();


private static byte[] init__query_eof_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,   21,   21,    0,    0,    0,    0,   23,   23,    0,
	   25,   25
	};
}

private static final byte _query_eof_actions[] = init__query_eof_actions_0();


static final int query_start = 1;
static final int query_first_final = 39;
static final int query_error = 0;

static final int query_en_main = 1;


// line 71 "PathQuery.ragel"


	public boolean parse(String urlPart) {
		char[] data = urlPart.toCharArray();
		
		// Used by Ragel
        int cs;
        int p = 0;
        int pe = data.length;
        int eof = data.length;
        
        // Used to store extracted data
        final int zero = (int) '0';
        int i = 0;
        double f = 0.0;
        double scale = 1.0;
		
		// reset state
		from = Currency.BITCOIN;
		to   = Currency.DOLLAR;
		amount = -1;
		
		
// line 202 "src/com/appspot/btcticker/fsm/PathQuery.java"
	{
	cs = query_start;
	}

// line 94 "PathQuery.ragel"
		
// line 209 "src/com/appspot/btcticker/fsm/PathQuery.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _query_key_offsets[cs];
	_trans = _query_index_offsets[cs];
	_klen = _query_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _query_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _query_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _query_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _query_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _query_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _query_indicies[_trans];
	cs = _query_trans_targs[_trans];

	if ( _query_trans_actions[_trans] != 0 ) {
		_acts = _query_trans_actions[_trans];
		_nacts = (int) _query_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _query_actions[_acts++] )
			{
	case 0:
// line 20 "PathQuery.ragel"
	{ i = 0; f = 0.0; scale = 1.0; }
	break;
	case 1:
// line 21 "PathQuery.ragel"
	{ i = i * 10 + (int)data[p] - zero; }
	break;
	case 2:
// line 22 "PathQuery.ragel"
	{ scale = scale * 0.1; f = f + scale * ((int)data[p] - zero); }
	break;
	case 3:
// line 29 "PathQuery.ragel"
	{ }
	break;
	case 4:
// line 30 "PathQuery.ragel"
	{ to = Currency.EURO; }
	break;
	case 5:
// line 31 "PathQuery.ragel"
	{ to = Currency.POUND; }
	break;
	case 6:
// line 32 "PathQuery.ragel"
	{ to = Currency.DKK; }
	break;
	case 7:
// line 38 "PathQuery.ragel"
	{ }
	break;
	case 8:
// line 39 "PathQuery.ragel"
	{ to = Currency.EURO; }
	break;
	case 9:
// line 40 "PathQuery.ragel"
	{ to = Currency.POUND; }
	break;
	case 10:
// line 41 "PathQuery.ragel"
	{ to = Currency.DKK; }
	break;
	case 11:
// line 46 "PathQuery.ragel"
	{ from = Currency.DOLLAR; to = Currency.BITCOIN; }
	break;
	case 12:
// line 49 "PathQuery.ragel"
	{ from = Currency.EURO; to = Currency.BITCOIN; }
	break;
	case 13:
// line 52 "PathQuery.ragel"
	{ from = Currency.POUND; to = Currency.BITCOIN; }
	break;
	case 14:
// line 55 "PathQuery.ragel"
	{ from = Currency.DKK; to = Currency.BITCOIN; }
	break;
	case 15:
// line 57 "PathQuery.ragel"
	{ amount = i + f; }
	break;
	case 16:
// line 61 "PathQuery.ragel"
	{ rate = Rate.BUY; }
	break;
	case 17:
// line 61 "PathQuery.ragel"
	{ amount = i + f; }
	break;
	case 18:
// line 65 "PathQuery.ragel"
	{ amount = i + f; }
	break;
// line 365 "src/com/appspot/btcticker/fsm/PathQuery.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
	if ( p == eof )
	{
	int __acts = _query_eof_actions[cs];
	int __nacts = (int) _query_actions[__acts++];
	while ( __nacts-- > 0 ) {
		switch ( _query_actions[__acts++] ) {
	case 15:
// line 57 "PathQuery.ragel"
	{ amount = i + f; }
	break;
	case 17:
// line 61 "PathQuery.ragel"
	{ amount = i + f; }
	break;
	case 18:
// line 65 "PathQuery.ragel"
	{ amount = i + f; }
	break;
// line 398 "src/com/appspot/btcticker/fsm/PathQuery.java"
		}
	}
	}

case 5:
	}
	break; }
	}

// line 95 "PathQuery.ragel"
		
		if (cs < query_first_final) {
			return false;
		}
		
		return true;
	}
}